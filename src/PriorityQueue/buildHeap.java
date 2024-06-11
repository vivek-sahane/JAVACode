package PriorityQueue;
//time complexity = O(n)

public class buildHeap {

    //function defination of heapify
    public static void heapify(int[]arr, int n, int i){
        int largest=i;
        int leftIdx = 2*i+1;
        int rightIdx = 2*i+2;
        //construction of maxheap
        if(leftIdx<n && arr[leftIdx] > arr[largest]){
            largest = leftIdx;
        }

        if(rightIdx < n && arr[rightIdx] > arr[largest]){
            largest= rightIdx;
        }

        if(largest !=i){
            //update of largest index
            //swap (arr[largest],arr[i])
            int temp= arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            //recursion
            heapify(arr,n,largest);
        }
    }
    //function defination of buildheap
    public static void buildHeap(int[]arr, int n){
        //the last non-leaf node node index
        int startIdx = (n/2)-1;
        for(int i=startIdx ; i>=0;i--){
            heapify(arr,n,i);
        }
    }
    //function defination of displayHeap
    public static void displayHeap(int[]arr,int n){
        System.out.println("Array construction of maxHeap:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,4,6,13,10,9,8,15,17};
        int n = arr.length;

        //function calling
        buildHeap(arr,n);
        displayHeap(arr,n);
    }
}
