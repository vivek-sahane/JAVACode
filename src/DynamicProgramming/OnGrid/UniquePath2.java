package DynamicProgramming.OnGrid;

public class UniquePath2 {
    public int uniquePaths(int[][] a, int n, int m) {

        int[][] dp = new int[n][m];
        if(a[0][0] == 1) dp[0][0] = 0;
        else dp[0][0] = 1;

        for(int i=1; i<n; i++) {
            if(a[i][0] == 1 || dp[i-1][0] == 0) {
                dp[i][0] = 0;
            }
            else{
                dp[i][0] = 1;
            }
        }

        for(int j=1; j<m; j++) {
            if(a[0][j] == 1 || dp[0][j-1]==0) {
                dp[0][j]=0;
            }
            else{
                dp[0][j] = 1;
            }
        }

        for(int i=1; i<n; i++) {
            for(int j=1; j<m; j++) {
                if(a[i][j] ==1) {
                    dp[i][j] = 0;
                }
                else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[n][m];
    }
}
