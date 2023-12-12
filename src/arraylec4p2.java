import java.util.*;


public class arraylec4p2 {    //Rotate array k times

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] rotateArray(int arr[],int k){
        int n= arr.length ;
        int []ans =new int[n];
        k = k % n ;
        int j=0 ;

         for(int i=n-k ;i<n ;i++) {
            ans[j++] = arr[i];
        }
        for(int i=0 ;i<n-k ; i++){
            ans[j++]=arr[i];
        }
        return ans ;
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
        System.out.println("Enter k:");
        int k=sc.nextInt();

        System.out.println("Original Array");
        printArray(arr);
        int []ans=rotateArray(arr,k);                //calling function   //new arr input
        System.out.println("Array after rotation");
        printArray(ans);
    }
}
