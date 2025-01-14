package DynamicProgramming.OnGrid;

public class MinimumPathSum {
    public int minimumPathSum(int[][]a, int n, int m) {
        int[][] dp = new int[n+1][m+1];
        dp[0][0] = a[0][0];

        for(int i=1; i<n; i++) {
            dp[i][0] = a[i][0] + dp[i-1][0];
        }

        for(int j=1; j<m; j++) {
            dp[0][j] = a[0][j] + dp[0][j-1];
        }

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                dp[i][j] = a[i][j] + Math.min(dp[i-1][j] , dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
}
