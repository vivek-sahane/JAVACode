package HashSet;
import java.util.*;
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer>st=new HashSet<>();
        for(int num: nums)st.add(num);
        int maxStreak = 0;
        for(int num :st){
            if(!st.contains(num-1)){
                int currStreak =1;
                int currNum =num;
                while(st.contains(currNum+1)){
                    currNum++;
                    currStreak++;
                }
                maxStreak = Math.max(maxStreak , currStreak);
            }
        }
        return maxStreak;
    }

    public static void main(String[] args) {

    }
}
