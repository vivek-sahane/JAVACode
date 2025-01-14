
import java.util.Scanner;

class PQ {
    int[] P;
    int size;
    int capacity;

    public PQ(int capacity) {
        this.capacity = capacity;
        P = new int[capacity];
        size = -1;
    }

    public int Left_child(int i) {
        return (2 * i + 1);
    }

    public int Right_child(int i) {
        return (2 * i + 2);
    }

    public int parent(int i) {
        return (i - 1) / 2;
    }

    public void insert(int key) {
        size++;
        P[size] = key;
        ShiftUp(size);
    }

    public void ShiftUp(int i) {
        while (i > 0 && P[parent(i)] < P[i]) {
            swap(parent(i), i);
            i = parent(i);
        }
    }

    public void swap(int i, int j) {
        int temp = P[i];
        P[i] = P[j];
        P[j] = temp;
    }

    public void display() {
        if (size == -1) {
            System.out.println("Priority Queue is empty.");
            return;
        }
        for (int i = 0; i <= size; i++) {
            System.out.print(P[i] + " ");
        }
        System.out.println();
    }

    public int getMax() {
        if (size == -1) {
            System.out.println("Priority Queue is empty.");
            return -1;
        }
        return P[0];
    }

    public void extractMax() {
        if (size == -1) {
            System.out.println("Priority Queue is empty.");
            return;
        }
        System.out.println("Max Element: " + P[0]);
        P[0] = P[size];
        size--;
        ShiftDown(0);
    }

    public void ShiftDown(int i) {
        int maxIndex = i;
        int left = Left_child(i);
        if (left <= size && P[left] > P[maxIndex]) {
            maxIndex = left;
        }
        int right = Right_child(i);
        if (right <= size && P[right] > P[maxIndex]) {
            maxIndex = right;
        }
        if (i != maxIndex) {
            swap(i, maxIndex);
            ShiftDown(maxIndex);
        }
    }

}

public class PriorityQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of the priority queue: ");
        int capacity = sc.nextInt();
        PQ obj = new PQ(capacity);
        int b;

        do {
            System.out.println("Operations:\n1. Insert\n2. Display\n3. Extract Max\n4. Display Max\n5. Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number of keys:");
                    int n = sc.nextInt();
                    System.out.println("Enter keys to insert:");
                    for (int i = 0; i < n; i++) {
                        int key = sc.nextInt();
                        obj.insert(key);
                    }
                    break;
                case 2:
                    System.out.println("Displaying Priority Queue...");
                    obj.display();
                    break;
                case 3:
                   obj.extractMax();
                    break;
                case 4:
                    System.out.println("Maximum Element: " + obj.getMax());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Enter 1 to continue and 0 to stop:");
            b = sc.nextInt();
        } while (b != 0);
    }
}