import java.util.*;
public class Stringp5palindromicnumber2 {
    public static void main(String[] args) {

        String str = "abcdcba";
        int i = 0;
        int j = str.length() - 1;
        boolean flag =true;
        while (i < j) {
            if (str.substring(i) != str.substring(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if (flag == true) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
}
