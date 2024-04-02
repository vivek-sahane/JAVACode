package HashMap;
import java.util.*;
public class LargestSubarrayWithMaxPairOf0and1 {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int mxLen=0,prefSum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)prefSum+=1;
            else prefSum-=1;
            if(prefSum==0){
                mxLen =i+1;
            }
            if(mp.containsKey(prefSum)){    //O(n)
                mxLen = Math.max(i-mp.get(prefSum),mxLen);
            }
            else{
                mp.put(prefSum,i);
            }
        }
        return mxLen;
    }

    public static void main(String[] args) {
        LargestSubarrayWithMaxPairOf0and1 sc= new LargestSubarrayWithMaxPairOf0and1();
        int[] pp={1,0,1,0,1,1,1};
       int sp=sc.findMaxLength(pp);
        System.out.println(sp);
}
}