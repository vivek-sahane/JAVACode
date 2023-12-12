import java.util.Arrays;
import java.util.Scanner;

public class arraylec2p3{ //print smallest and largest element of array

    public static int[] smallestAndLargestElement(int arr[]){
        Arrays.sort(arr);
        int ans[] = {arr[0] , arr[arr.length-1]};
        return ans ;
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
        int[]ans = smallestAndLargestElement(arr);
        System.out.println("Smallest :"+ ans[0]);
        System.out.println("Smallest :"+ ans[1]);
    }
}
