package DynamicProgramming.OnGrid;

import java.util.List;

public class Triangle {
    public int minimumPathSum(List<List<Integer>> a,int row,int col,int[][] dp) {

        if(row == a.size() - 1) {
            return a.get(row).get(col);
        }

        if(dp[row][col] != -1) return dp[row][col];

        int down = minimumPathSum(a,row+1,col,dp);
        int downr = minimumPathSum(a,row+1,col+1,dp);

        return dp[row][col] = a.get(row).get(col) + Math.min(down,downr);
    }
}
