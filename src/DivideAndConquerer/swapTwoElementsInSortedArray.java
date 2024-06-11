package DivideAndConquerer;

import java.util.*;
public class swapTwoElementsInSortedArray {

    public static void sortArr(int[]arr,int n){
        if(n<=1)return;

        int x=-1;
        int y=-1;
        int prev = arr[0];

        for(int i=1;i<n;i++){
            if(prev>arr[i]){
                if(x==-1){
                    x=i-1;
                    y=i;
                }
                else{
                    y=i;
                }
            }
            prev = arr[i];
        }
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    public static void main(String[] args) {
        int[]arr={3,8,6,7,5,9,10};
        int n=arr.length;
        sortArr(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
