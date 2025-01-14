package DynamicProgramming.OnGrid;

public class D3maxChoco2Ninja {
    public int maximumChoco(int n, int m,int[][] a) {

        int[][][]dp = new int[n][m][m];

        for(int j1=0; j1<m; j1++) {
            for(int j2=0; j2<m; j2++) {
                if(j1 == j2) {
                    dp[n-1][j1][j2] = a[n-1][j1];
                }
                else{
                    dp[n-1][j1][j2] = a[n-1][j1] + a[n-1][j2];
                }
            }
        }

        for(int i=n-2; i>=0; i--) {
            for(int j1=0; j1<m; j1++) {
                for(int j2=0; j2<m; j2++) {
                    int maxi = Integer.MIN_VALUE;

                    //inner nested loops to tryout 9 ways
                    for(int di=-1; di<=1; di++) {
                        for(int dj=-1; dj<=1; dj++) {
                            int ans;
                            if(j1==j2) {
                                ans = a[i][j1];
                            }
                            else{
                                ans = a[i][j1] + a[i][j2];
                            }

                            if((j1 + di <0 || j1 + di >=m) || (j2+dj <0 || j2+dj >=m)){
                                ans += (int)Math.pow(-10,9);
                            }
                            else{
                                ans += dp[i+1][j1+di][j2+dj];
                            }

                            maxi = Math.max(ans, maxi);
                        }
                    }
                    dp[i][j1][j2] = maxi;
                }
            }
        }
        return dp[0][0][m-1];
    }
}
