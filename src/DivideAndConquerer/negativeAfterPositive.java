package DivideAndConquerer;

public class negativeAfterPositive {
    public static void partition(int[]arr, int s, int e){
        int pindex=s;
        for(int i=s;i<=e;i++){
            if(arr[i]<0){
                int temp = arr[i];
                arr[i]=arr[pindex];
                arr[pindex]=temp;
                pindex++;
            }
        }
    }
    public static void main(String[] args) {
    int[]arr ={19,-20,7,-4,-13,11,-5,3};
    int n=arr.length;
    partition(arr,0,n-1);
    for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
    }
    }
}
