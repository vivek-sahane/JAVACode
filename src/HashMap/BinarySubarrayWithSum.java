package HashMap;
import java.util.*;
public class BinarySubarrayWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int prefSum =0, ans = 0;
        mp.put(0,1);
        for(int i=0;i< nums.length; i++){
            prefSum += nums[i];
            ans += mp.getOrDefault(prefSum -goal,0);
            mp.put(prefSum , mp.getOrDefault(prefSum , 0)+1);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
