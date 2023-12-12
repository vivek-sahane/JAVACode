import java.util.Arrays;
import java.util.Scanner;

public class arraylec2p2 { //print sorted array
    public static void smallestAndLargestElement(int arr[]){
        Arrays.sort(arr);
        for(int i =0 ; i<arr.length ;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements of array " + n);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        smallestAndLargestElement(arr);
    }
}
