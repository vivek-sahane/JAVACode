package GeeksForGeeks;
import java.util.*;
public class subArrayIndexTargetSum {

        /* Function to find a continuous sub-array which adds up to a given number.
        * FaceBook , Google , Amazon
        * Input:
         N = 10, S = 15
         A[] = {1,2,3,4,5,6,7,8,9,10}
         Output: 1 5
         Explanation: The sum of elements
        from 1st position to 5th position
        is 15.
        *
        *
        * Input:
        N = 5, S = 12
        A[] = {1,2,3,7,5}
        Output: 2 4
        Explanation: The sum of elements
        from 2nd position to 4th position
        is 12.
        *
        *
        *
        *
        * */
        static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
            ArrayList<Integer> ans = new ArrayList<>();

            int start = 0;
            int end = n, i = 0;
            int currSum = 0;

            while (start < end) {

                currSum +=arr[start];

                if(currSum >= s){
                    int last = start;

                    while(s<currSum && i<last){
                        currSum -=arr[i];
                        ++i;
                    }

                    if(currSum ==s){
                        ans.add(i+1);
                        ans.add(last+1);
                        break;
                    }
                }
                start++;
            }
            if(ans.size()==0){
                ans.add(-1);
                return ans;
            }
            return ans;
        }


}
