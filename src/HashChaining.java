import java.util.*;
class Hashh {
    public int tableSize;
    public  LinkedList<Integer>[]table;
    public Hashh(int tableSize) {
        this.tableSize=tableSize;
        table = new LinkedList[tableSize];
        for (int i = 0; i < tableSize; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public void insert(int key) {
        int idx = key % tableSize;
        table[idx].add(key);
        System.out.println("Inserted key :" +key+"at index :"+idx +"");
    }

    public void display(){
        for(int i=0;i<tableSize;i++){
            System.out.print("Index " +i+" :");
            for(int key=0; key< table[i].size(); key++) {
                System.out.print(table[i].get(key) +" -> ");
            }
            System.out.println(" null");
        }
    }

    public boolean search(int key){
        int idx = key%tableSize;
        return table[idx].contains(key);
    }

}

public class HashChaining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of HashTable: ");
        int tableSize = sc.nextInt();

        Hashh hashTable = new Hashh(tableSize);

        System.out.println("Enter the number of numbers to insert: ");
        int numKeys = sc.nextInt();

        for (int i = 0; i < numKeys; i++) {
            System.out.println("Enter key " + (i + 1) + ": ");
            int key = sc.nextInt();
            hashTable.insert(key);
        }

        while (true) {
            System.out.println("Enter the operation you want to perform:");
            System.out.println("1. Insert");
            System.out.println("2. Display Hash Table");
            System.out.println("3. Search");
            System.out.println("4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the key to insert: ");
                    int newKey = sc.nextInt();
                    hashTable.insert(newKey);
                    break;
                case 2:
                    hashTable.display();
                    break;
                case 3:
                    System.out.println("Enter the element you want to search");
                    int a=sc.nextInt();
                    if(hashTable.search(a)) System.out.println("Element found !");
                    else System.out.println("Element not found !");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
                    break;
            }
        }
    }
}
