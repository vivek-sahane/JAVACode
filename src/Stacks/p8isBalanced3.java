package Stacks;
import java.util.*;
public class p8isBalanced3 {

    public static boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }

                char openSymbol = st.pop();
                if ((ch == ')' && openSymbol != '(') ||
                        (ch == '}' && openSymbol != '{') ||
                        (ch == ']' && openSymbol != '[')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isValid(str));
    }
}
