import java.util.*;
public class Stringp7Stringcompression {
    public static void main(String[] args) {
        String str = "aaabbbbccdddeee";
        String ans = " "+str.charAt(0);            //small hack for  writing like this
        int count =1;
        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr == prev){
                count++;
            }
            else{
               if(count>1)  ans +=count;
                count =1;               //restarting the value of count
                ans +=curr;
            }
        }
        if(count>1) ans+=count;     // for last
        System.out.println(ans);
    }
}
