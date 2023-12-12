import java.util.*;
                               //when prefixsum = suffixsum then print true else false
public class arraylec6p3 {

    public static int FindArraysum(int arr[]){
        int totalsum =0;
        for(int i=0 ; i< arr.length ;i++){
            totalsum += arr[i];
        }
        return totalsum ;
    }
    public static boolean equalsumPartition (int []arr){
        int totalsum = FindArraysum(arr);

        int prefsum =0 ;
        for( int i=0 ;i<arr.length ;i++){
            prefsum += arr[i];
            int suffixsum = totalsum - prefsum ;
            if(suffixsum == prefsum){
                return true ;
            }
        }
        return false ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Elements of array"+n);
        for(int i=0 ; i<arr.length ;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(equalsumPartition(arr));
    }
}
