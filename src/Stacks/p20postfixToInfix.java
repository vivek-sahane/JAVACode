package Stacks;
import java.util.*;
public class p20postfixToInfix {
    public static void main(String[] args) {
        String str ="953+4*6/-";
        Stack<String> val = new Stack<>();
        for(int i=0;i<=str.length()-1;i++){
            char ch= str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ch+"");
            }
            else{
                String v2=val.pop();
                String v1=val.pop();
                char op=ch;
                //v1 op v2
                String t= "("+v1+op+v2+")";
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
