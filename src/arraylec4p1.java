import java.util.*;

public class arraylec4p1 {    //Reverse an array Method 1 = traversing and method 2 = by swapping ;

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
       public static void swapInArray( int arr[],int i ,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

    public static int[] ReverseArraym1(int arr[]) {
        int n = arr.length;
        int[] ans = new int[n];        //arr ans input
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static int [] ReverseArraym2 (int []arr){
        int i=0 ;
       int j=arr.length-1 ;
        while(i<j){                 //when i and j is equal then stop swapping otherwise array return swap the values
            swapInArray(arr,i,j);
            i++ ;
            j-- ;
        }
        return arr ;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6};
        int []ans =ReverseArraym2(arr);
        printArray(arr);
        System.out.println(ReverseArraym2(arr));
    }
}
