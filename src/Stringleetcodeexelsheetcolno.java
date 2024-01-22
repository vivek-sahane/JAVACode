
import java.util.*;
/*
Exel sheet colomn number
Example 1:

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701
 */
public class Stringleetcodeexelsheetcolno {

    public int titleToNumber(String columnTitle) {
        int columnNumber=0;
        for(int i=0;i<columnTitle.length();i++)
        {
            columnNumber=columnNumber*26+(columnTitle.charAt(i)-64);
        }
        return columnNumber;
    }

    /*
    Reverse if given no give colomn name
     */
    public String convertToTitle(int c) {
        if(c<27){
            return Character.toString((char) ('A' + (c- 1)));
        }
        StringBuilder ans=new StringBuilder("");
        while(c>0){
            int x=c%26;
            if(x==0){
                ans.append('Z');
                c--;
            }
            else{
                ans.append((char)('A'+x-1));
            }
            c/=26;
        }
        return ans.reverse().toString();
    }
    public static void main(String[] args) {

    }
}
