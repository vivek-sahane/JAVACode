package MyClgCode;
import java.util.*;

public class GraphDFS {
    private static void DFS(List<List<Integer>> adj,int n){
        int[] vis = new int[n];
        Stack<Integer> st = new Stack<>();
        vis[0] = 1;
        st.push(0);

        System.out.println("DFS Traversal of the Graph:");
        System.out.print(0+" ");
        while(!st.isEmpty()){
            int node = st.pop();

            for(int it: adj.get(node)){
                if(vis[it] == 0){
                    vis[it] = 1;
                    System.out.print(" "+it);
                    st.push(it);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int n = sc.nextInt();

        System.out.println("Enter the number of edges:");
        int e = sc.nextInt();

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter the edges (source , destination) one by one:");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u); // Remove this line for directed graphs
        }

        DFS(adj,n);

    }
}
