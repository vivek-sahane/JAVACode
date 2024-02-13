package Stacks;
import java.util.*;
public class p11stockSpanElement {
    public static void main(String[] args) {
        int[] arr = {6, 3, 4, 5, 2};

        int[] span = calculateSpan(arr);

        // Print the span array
        System.out.println(Arrays.toString(span));
    }

    private static int[] calculateSpan(int[] arr) {
        int n = arr.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            span[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        return span;
    }
}
