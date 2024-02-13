package Stacks;

import java.util.Stack;

public class basicsOfStacks {
    public static void main(String[] args) {

        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(5);
        st.push(11);
        st.push(15);
        //peek
        System.out.println(st.peek());
    }
}
