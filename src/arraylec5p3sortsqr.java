import java.util.*;

public class arraylec5p3sortsqr {            //two pointer approach for square a sorted array

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] sortSquares(int arr[]){
        int n= arr.length ;
        int left=0 ;
        int right = n-1 ;
        int []ans = new int [n];
        int k=0 ;

        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
               ans [k++]= arr[left] * arr[left];
               left++ ;
            }
            else{
                ans[k++]= arr[right] * arr[right];
                right-- ;
            }
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
        System.out.println("Original Array");
        printArray(arr);
        sortSquares(arr);                               //calling function
        System.out.println("Array after rotation");
        printArray(arr);
    }
}
