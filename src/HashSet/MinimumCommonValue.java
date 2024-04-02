package HashSet;
import java.util.*;
public class MinimumCommonValue {
/*
Example 1:

Input: nums1 = [1,2,3], nums2 = [2,4]
Output: 2
Explanation: The smallest element common to both arrays is 2, so we return 2.
Example 2:

Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
Output: 2
Explanation: There are two common elements in the array 2 and 3 out of which 2 is the
 */

    public int getCommon(int[] nums1, int[] nums2) {        //Approach 1
        HashSet<Integer> st1 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            st1.add(nums1[i]);
        }
        for(int num :nums2){
            if(st1.contains(num))return num;
        }
        return -1;
    }

    public int getCommon2(int[] nums1, int[] nums2) {               //approach 2
        int first =0,second =0;
        while(first<nums1.length && second<nums2.length){
            if(nums1[first]<nums2[second])first++;
            else if(nums1[first]>nums2[second])second++;
            else return nums1[first];
        }
        return -1;
    }


    public static void main(String[] args) {

    }
}
