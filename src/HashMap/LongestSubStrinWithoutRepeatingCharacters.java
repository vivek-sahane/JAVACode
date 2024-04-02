package HashMap;
import java.util.*;
public class LongestSubStrinWithoutRepeatingCharacters {
    /*
    Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(mp.containsKey(ch) && mp.get(ch) >= start) {
                start = mp.get(ch) + 1;
            }
            mp.put(ch, i);
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }
}
