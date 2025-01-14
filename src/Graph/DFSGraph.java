package Graph;
import java.util.*;

public class DFSGraph {

    public static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls) {
        // Mark the current node as visited
        vis[node] = true;
        ls.add(node);
        // Recursively visit all adjacent unvisited nodes
        for (Integer it : adj.get(node)) {
            if (vis[it]==false) {
                dfs(it, vis, adj, ls);
            }
        }
    }

    // Function to return a list containing the DFS traversal
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V]; // Adjusted to V nodes, starting from 0
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0, vis, adj, ls); // Starting DFS from node 0
        return ls;
    }

    public static void main(String[] args) {
        // Number of vertices
        int V = 5;

        // Adjacency list representation of the graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list for each node
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }

        // Adding edges between nodes (0-indexed)
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(2).add(0);
        adj.get(2).add(4);
        adj.get(3).add(1);
        adj.get(4).add(2);

        // Creating the object of DFSGraph class
        DFSGraph graph = new DFSGraph();

        // Getting DFS trvaersal
        ArrayList<Integer> result = graph.dfsOfGraph(V, adj);

        // Printing the result
        System.out.println("DFS Traversal: " + result);
    }
}
