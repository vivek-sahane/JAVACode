package DynamicProgramming;
import java.util.*;

public class ClimbingStairs {
    public static Map<Integer, Integer> memo = new HashMap<>();

    public int climbStairs(int n) {
        if(n==1 || n==2){
            return n;
        }

        if(memo.containsKey(n)){
            return memo.get(n);
        }

        int numWays = climbStairs(n-1) + climbStairs(n-2);
        memo.put(n , numWays);
        return numWays;
    }

    public int climbStairs2(int n) {
        if (n <= 2) {
            return n;
        }

        int[] cs = new int[n + 1];
        cs[1] = 1;
        cs[2] = 2;

        for (int i = 3; i <= n; i++) {
            cs[i] = cs[i - 1] + cs[i - 2];
        }

        return cs[n];
    }

    //Most Optimised Approach
    //T.C = O(n);
    //S.c = O(1);
    public int climbStairs3(int n) {
        if(n==1){
            return 1;
        }

        int first=1, second =2, third;
        for(int i=3;i<=n ;i++){
            third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

}
