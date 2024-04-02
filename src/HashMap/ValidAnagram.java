import java.util.*;
public class ValidAnagram {
    static HashMap<Character, Integer> makeFreqMap(String str) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!mp.containsKey(ch)) {
                mp.put(ch, 1);
            } else {
                int currMax = mp.get(ch);
                mp.put(ch, currMax + 1);
            }
        }
        return mp;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> mp1 = makeFreqMap(s);
        HashMap<Character, Integer> mp2 = makeFreqMap(t);
        return mp1.equals(mp2);
    }
    public boolean isAnagram2(String s , String t){
        if(s.length()!= t.length())return false;
        HashMap <Character,Integer> mp = makeFreqMap(s);
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!mp.containsKey(ch))return false;
            int currFrequency = mp.get(ch);
            mp.put(ch,currFrequency+1);
        }
        for(Integer i : mp.values()){
            if (i!=0)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();

        // Example inputs
        String input1 = "listen";
        String input2 = "silent";

        // Check if the strings are anagrams
        boolean result = validAnagram.isAnagram(input1, input2);

        // Print the result
        System.out.println("Are '" + input1 + "' and '" + input2 + "' anagrams? " + result);
    }
}
