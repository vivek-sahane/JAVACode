package DynamicProgramming.BasicDPOnArray;

public class MaxSumWithoutAdjacent {
    public int findMaxSum(int[]a, int n) {
        //edge cases
        if(n==0) return 0;
        if(n==1) return a[n];

        int[] dp = new int[n];
        dp[0] = a[0];
        dp[1] = Math.max(a[0],a[1]);

        for(int i=2; i<n; i++) {
            dp[i] = Math.max(dp[i-1],a[i] + dp[i-2]);
        }

        return dp[n-1];
    }
}
