import java.util.*;
                             //output not getting
public class arraylec6p1 {   //prefix sum


    public static void printArray(int arr[]) {
        int n=arr.length ;
        for(int i=0 ; i<n ;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static int [] PrefixSum(int arr[]){   // method one
        int n=arr.length ;
        int []pref = new int [n];
         pref[0]= arr[0];
        for(int i=0 ;i< n ;i++){
            pref[i]= pref[i-1] + arr[i];
        }
        return pref ;
    }
    public static int[] makePrefixSum(int arr[]){    //method two
      for (int i=0 ; i<arr.length ;i++){
          arr[i]=arr[i]+ arr[i-1];
      }
      return arr;
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
        System.out.println("Original Array");
        printArray(arr);
        makePrefixSum(arr) ;                              //calling function
        System.out.print("Array after prefix sum");
        printArray(arr);
    }
}
