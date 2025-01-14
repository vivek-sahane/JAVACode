package DynamicProgramming.OnGrid;

public class MinFallingPathSum {
    public int minFallingPathSum(int[][] a, int n , int m) {

        int[][] dp = new int[n][m];
        for(int j=0; j<m; j++) {
            dp[n-1][j] = a[n-1][j];
        }

        for(int i= n-2; i>=0; i--) {
            for(int j=0; j<m; j++) {
                int minpathsum = dp[i+1][j];

                if( j-1 >=0 ) {
                    minpathsum = Math.min(minpathsum, dp[i+1][j-1]);
                }
                if(j+1<m) {
                    minpathsum = Math.min(minpathsum, dp[i+1][j+1]);
                }

                dp[i][j] = a[i][j] + minpathsum;
            }
        }
        int res = Integer.MAX_VALUE;
        for(int j=0; j<m; j++) {
            res = Math.min(res,dp[0][j]);
        }
        return res;
    }
}
