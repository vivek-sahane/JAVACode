package Stacks;

import java.util.Stack;

public class p10nextGreaterElementM2 {

        public static void main(String[] args) {
            Stack<Integer> st = new Stack<>();
            int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
            int n = arr.length;
            int[] res = new int[arr.length];
            res[n - 1] = -1;
            st.push(arr[n - 1]);

            for (int i = n - 2; i >= 0; i--) {
                while (!st.isEmpty() && st.peek() < arr[i]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    res[i] = -1;
                } else {
                    res[i] = st.peek();
                }
                st.push(arr[i]);
            }

            // Print or use the 'res' array as needed
            for (int val : res) {
                System.out.print(val + " ");
            }
        }
    }


