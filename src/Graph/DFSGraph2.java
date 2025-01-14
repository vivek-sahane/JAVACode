package Graph;

import java.util.*;

public class DFSGraph2 {
    int V;
    LinkedList<Integer>[] adj;

    DFSGraph2(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adj[src].add(dest);
    }

    public void DFS(int a) {
        boolean[] vis = new boolean[V];
        Stack<Integer> s = new Stack<>();
        vis[a] = true;
        s.push(a);

        while (!s.isEmpty()) {
            int c = s.pop();
            System.out.print(" " + c);

            for (int i = 0; i < adj[c].size(); i++) {
                int next = adj[c].get(i);
                if (!vis[next]) {
                    vis[next] = true;
                    s.push(next);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int V = sc.nextInt();

        DFSGraph2 g = new DFSGraph2(V);

        System.out.println("Enter the number of edges:");
        int d = sc.nextInt();

        while (d != 0) {
            System.out.println("Enter the source vertex:");
            int e = sc.nextInt();
            System.out.println("Enter the destination vertex:");
            int f = sc.nextInt();
            g.addEdge(e, f);
            d--;
        }

        System.out.println("DFS traversal starting from vertex 0:");
        g.DFS(0);

    }
}
