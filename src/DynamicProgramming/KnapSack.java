package DynamicProgramming;
public class KnapSack {
    // function definition
    // Recursive approach
    // time complexity: O(2^n) - Exponential time complexity
    // space complexity: O(n)
    public static int knapSack(int m, int[] profit, int[] weight, int n){
        // base case condition
        if(m == 0 || n == 0){
            return 0;
        }

        // recursive function calls
        if(weight[n-1] > m){
            // exclude the object
            return knapSack(m, profit, weight, n-1);
        }

        else{
            // max(exclude the object, include the object)
            return Math.max(knapSack(m, profit, weight, n-1), profit[n-1] + knapSack(m-weight[n-1], profit, weight, n-1));
        }
    }


    // function definition of Memoization approach in dp
    // Memoization approach - Enhanced Recursion
    public static int knapSackMemo(int m, int[] profit, int[] weight, int n, int[][] dp){
        // base case condition
        if(m == 0 || n == 0){
            return 0;
        }

        // optimization - avoid the recomputation of recursive function calls
        if(dp[n][m] != -1){
            return dp[n][m];
        }

        // recursive function calls
        if(weight[n-1] > m){
            // exclude the object
            return dp[n][m] = knapSack(m, profit, weight, n-1);
        }

        else{
            // max(exclude the object, include the object)
            return dp[n][m] = Math.max(knapSack(m, profit, weight, n-1), profit[n-1] + knapSack(m-weight[n-1], profit, weight, n-1));
        }
    }



    // function definition of helper function of memoization approach
    public static int helper(int m, int[] profit, int[] weight, int n){
        // initialization of 2D array named "dp"
        int dp[][] = new int[n+1][m+1];

        // intialization of the 2D array with -1
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                dp[i][j] = -1;
            }
        }

        // function calling
        return knapSackMemo(m, profit, weight, n, dp);

    }

    // function definition of knapSackTabu method
    // tabulation approach in dp - No recursion
    // time complexity: O(n * m)
    // space complexity: O(n * m)
    public static int knapSackTabu(int m, int[] profit, int[] weight, int n){
        int[][] dp = new int[n+1][m+1];

        for(int i=0; i<=n; i++){
            for(int w=0; w<=m; w++){
                if(i == 0 || w == 0){
                    dp[i][w] = 0;
                }

                else if(weight[i-1] <= w){
                    dp[i][w] = Math.max(dp[i-1][w], profit[i-1] + dp[i-1][w - weight[i-1]]);
                }
                else{
                    dp[i][w] = dp[i-1][w];
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args){
        int[] profit = {60, 100, 120};
        int[] weight = {10, 20, 30};

        int m = 50;
        int n = profit.length;

        // function calling
        System.out.println("Maximum profit of a given knapsack is: "+knapSackTabu(m, profit, weight, n));
    }
}