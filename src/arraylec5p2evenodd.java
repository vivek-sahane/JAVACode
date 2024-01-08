import java.util.*;

public class arraylec5p2evenodd {    //two pointer approach for even at start and odd number at end


    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void swapInArray(int arr[],int left,int right){
        int temp= arr[left];
        arr[left]=arr[right];
        arr[right]=temp ;
    }
    public static void sortArrayByParity(int arr[]){
        int n= arr.length ;
        int left=0 ;
        int right =n-1 ;
        while(left < right ){
            if(arr[left]%2 ==1 && arr[right]%2 ==0){
                swapInArray(arr,left,right);
                left++ ;
                right-- ;
            }
            if(arr[left]%2 ==0){
                left++ ;
            }
            if(arr[right]%2 ==1){
                right-- ;
            }
        }
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
        sortArrayByParity(arr);                          //calling function
        System.out.println("Array after rotation");
        printArray(arr);
    }
}
