package Stacks;
import java.util.*;

public class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
        // constructor
    }

    public void push(int val) {
        if (st.size() == 0) {
            st.push(val);
            min.push(val);
        } else {
            st.push(val);
            if (min.peek() < val) min.push(min.peek());
            else min.push(val);
        }
    }

    public void pop() {
        st.pop();
        min.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        // Pushing values into the stack
        minStack.push(7);
        minStack.push(8);
        minStack.push(5);
        minStack.push(6);
        minStack.push(3);
        minStack.push(4);

        // Displaying the contents of the stack
        System.out.println("Stack contents: " + minStack.st);

        // Displaying the top and minimum values
        System.out.println("Top element: " + minStack.top());
        System.out.println("Minimum element: " + minStack.getMin());
    }
}
