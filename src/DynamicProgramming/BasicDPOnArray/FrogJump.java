package DynamicProgramming.BasicDPOnArray;

public class FrogJump {
    public int minEnergyFrogJump(int[] a,int n) {
        int[] dp = new int[n];
        dp[0] = 0;
        for(int i=1; i<n; i++) {
            int rs = Integer.MAX_VALUE;
            int ls  = dp[i-1] + Math.abs(a[i] - dp[i-1]);
            if(i>1) {
                rs = dp[i-2] + Math.abs(a[i] - dp[i-2]);
            }
            dp[i] = Math.min(ls,rs);
        }
        return dp[n-1];
    }
}
