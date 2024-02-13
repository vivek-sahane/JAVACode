package Stacks;
import java.util.*;
public class p8isBalanced2 {
    public static int isBlanaced(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        int size;
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch =='('){
                st.push(ch);
            }
            else{
                if(st.size()==0);
                if(st.peek()=='(')st.pop();
            }
        }
        // if(st.size()>0)
        return st.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBlanaced(str));
    }
}
