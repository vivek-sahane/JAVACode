package Graph;



import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int first;
    int second;
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
public class NoOfIsland {
    private void bfs(int row, int col, int[][]vis, char[][]grid) {
        vis[row][col] = 1;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(row,col));
        int n = grid.length;
        int m = grid[0].length;

        while(!q.isEmpty()) {
            int ro = q.peek().first;
            int co = q.peek().second;
            q.poll();

            for(int delrow=-1; delrow<=1; delrow++) {
                for(int delcol=-1; delcol<=1; delcol++) {
                    int nrow = ro + delrow;
                    int ncol = co + delcol;

                    if(nrow >=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1' && vis[nrow][ncol] == 0) {
                        vis[nrow][ncol] = 1;
                        q.add(new Pair(nrow,ncol));
                    }
                }
            }
        }
    }

    public int numIsland(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int cnt = 0;

        for(int row =0; row<n; row++) {
            for(int col=0; col<m; col++) {
                if(vis[row][col]==0) {
                    cnt++;
                    bfs(row,col,vis,grid);
                }
            }
        }
        return cnt;
    }
}
