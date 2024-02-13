package Stacks;
import java.util.*;


public class p3ReverseStacks {

    public static void pushAtBottom(Stack<Integer> st , int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top =st.pop();
        pushAtBottom(st,x);
        st.push(top);
        }

    public static void reverseStack(Stack<Integer> st){
        if(st.size()==1)return ;
        int top = st.pop();
        reverseStack(st);
        pushAtBottom(st,top);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverseStack(st);
        System.out.println(st);
//        System.out.println(st);
//        //reverse stack
//        Stack<Integer> gt = new Stack<>();
//        while(st.size()>0){
//            gt.push(st.pop());
//        }
//        Stack<Integer> rt = new Stack<>();
//        while(gt.size()>0) {
//            rt.push(gt.pop());
//        }
//        System.out.println(rt);


    }
}
