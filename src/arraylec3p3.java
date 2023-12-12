import java.util.*;

public class arraylec3p3 {  //largest number and second largest number

    static int findmax(int arr[]){
        int max = Integer.MIN_VALUE ; // initialise with minus infinity
        for (int i =0 ; i< arr.length ; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max ;
    }
    static int findSecondmax(int arr[]){
        int max = findmax(arr);            //calling function
        for(int i=0 ;i< arr.length  ; i++){
            if(arr[i]== max){
                arr[i]=Integer.MIN_VALUE ;
            }
        }
       int secondmax =findmax(arr);     //calling function for retraverssing array
        return secondmax ;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Elements of array"+n);
        for(int i=0 ; i<arr.length ; i++){
            arr [i]= sc.nextInt();
        }
        System.out.println(findSecondmax(arr));
    }
}
