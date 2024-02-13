package Stacks;
import java.util.*;
public class p1InputStacks {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Stack<Integer> st = new Stack<>();
     System.out.println("Enter no. of elements :");
     int n = sc.nextInt();
        System.out.println("Enter numbers :");
     for(int i=1;i<=n;i++){
         int x = sc.nextInt();
         st.push(x);
     }
        System.out.println(st);
    }
}
