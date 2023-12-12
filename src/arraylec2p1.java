import java.util.Scanner;
//output is not correct
public class arraylec2p1 { // if sorted then print true

    public static boolean isSorted(int arr[]){

        boolean check = true ;
        for(int i = 1 ; i< arr.length ; i++){
            if(arr[i]< arr[i-1]){
                //not sorted
               return false ;
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
            System.out.println("isSorted"+ isSorted(arr));

        }
    }

