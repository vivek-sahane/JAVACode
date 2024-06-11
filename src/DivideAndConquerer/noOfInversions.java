package DivideAndConquerer;

import java.util.*;

public class noOfInversions {
    public static long merge(long arr[],long low,long mid,long high){
        ArrayList<Long> al = new ArrayList<Long>();
        long left=low;
        long right = mid+1;
        long count=0;
        while(left<=mid && right<=high){
            if(arr[(int)left]<=arr[(int)right])
            {
                al.add(arr[(int)left]);
                left++;
            }
            else{
                al.add(arr[(int)right]);
                count+=(mid-left+1);
                right++;
            }
        }
        while(left<=mid)
        {
            al.add(arr[(int)left]);
            left++;

        }
        while(right<=high)
        {
            al.add(arr[(int)right]);
            right++;
        }

        for(int i=(int)low;i<=high;i++){
            arr[i]=al.get(i-(int)low);

        }
        return count;

    }

    static long mergeSort(long [] arr,long low,long high){
        long count=0;
        if(low>=high) return count;
        long mid=(low+high)/2;
        count+=mergeSort(arr,low,mid);
        count+=mergeSort(arr,mid+1,high);
        count+=merge(arr,low,mid,high);
        return count;
    }

    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        return mergeSort(arr,0,N-1);
    }
}
