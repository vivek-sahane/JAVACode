package HashMap;
import java.util.*;
public class LargestSubAraayWith0Sum {
    int maxLen(int arr[], int n)
    {
        HashMap <Integer , Integer> mp = new HashMap<>();
        int mxLen = 0 , prefSum=0;
        mp.put(0,-1);
        for(int i=0;i<arr.length;i++){
            prefSum +=arr[i];
            if(mp.containsKey(prefSum)){
                mxLen = Math.max( i-mp.get(prefSum) , mxLen );
            }
            else{
                mp.put(prefSum , i );
            }
        }
        return mxLen;
    }

    public static void main(String[] args) {

    }
}
