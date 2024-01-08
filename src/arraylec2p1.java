import java.util.Scanner;
//output is not correct
public class arraylec2p1 { // if sorted then print true

    public static boolean isSorted(int arr[]){

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // If current element is greater than the next one, array is not sorted
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size ");
        int n =sc.nextInt();
       int arr[]= new int[n];
        System.out.println("enter elements of array "+n);
        for(int i =0 ; i< arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
            System.out.println(isSorted(arr));

        }
    }

