import java.util.*;

public class arraylec5p1 {       //two pointers approach type 0 and 1 method 1 and 2 = swapping

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
    public static void sortZeroesAndOnes(int[]arr){   //method two by swapping
        int n= arr.length ;                           //left=i ;right=j ;
        int i =0 ;
        int j =n-1 ;
        while(i < j){
            if(arr[i]== 1 && arr[j]==0){
                swapInArray(arr,i,j);
                i++ ;
                j--;
            }
            if (arr[i]==0){
                i++ ;
            }
            if(arr[j]==1){
                j-- ;
            }
        }
    }
    public static void zerosAndOnes(int arr[]){   //method one
       int n = arr.length ;
      int zeroes = 0;
      for(int i=0 ;i<n ;i++){                    //count number of zeroes
          if(arr[i]==0){
              zeroes++ ;
          }
      }
      for (int i=0 ;i<n;i++){
          if(i < zeroes){
              arr[i]=0;
          }
          else{
              arr[i]=1 ;
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
        zerosAndOnes(arr);                //calling function
        System.out.println("Array after rotation");
        printArray(arr);

    }
}
