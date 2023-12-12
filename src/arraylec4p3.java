import java.util.*;

public class arraylec4p3 { //Rotate array k times by swapping

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void swapInArray(int arr[],int i,int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp ;
    }
    public static void reverseArray(int arr[],int i,int j){
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }
    public static void rotateInPlace(int arr[],int k){
        int n = arr.length ;
        k=k%n ;
        reverseArray(arr,0 ,n-k-1);
        reverseArray(arr,n-k,n-1);
        reverseArray(arr,0 ,n-1);
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
        int k = sc.nextInt();

        System.out.println("Original Array");
        printArray(arr);
        rotateInPlace(arr,k);                //calling function
        System.out.println("Array after rotation");
        printArray(arr);
    }
}
