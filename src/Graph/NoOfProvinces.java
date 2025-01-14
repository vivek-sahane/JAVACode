package Graph;

import java.util.ArrayList;
import java.util.List;

public class NoOfProvinces {

    private void dfs(int node, List<List<Integer>> adj, int []vis) {
        vis[node]=1;
        for(int it: adj.get(node)){
            if(vis[it]==0){
                dfs(it,adj,vis);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<v; i++) {
            adj.add(new ArrayList<>());
        }

        for(int i=0; i<v; i++) {
            for(int j=0; j<v; j++) {
                if(isConnected[i][j] == 1 && i!=j) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        int[] vis = new int[v];
        int cnt = 0;

        for(int i=0; i<v; i++) {
            if(vis[i] == 0){
                cnt++;
                dfs(i,adj,vis);
            }
        }
        return cnt;
    }
}
