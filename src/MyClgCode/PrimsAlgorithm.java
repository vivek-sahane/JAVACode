package MyClgCode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;


public class PrimsAlgorithm {

    private static int prims(List<List<Pair>> adj, int n) {
        int[] vis = new int[n]; // Visited array
        PriorityQueue<iPair> pq = new PriorityQueue<>((x, y) -> x.first - y.first); // Min-heap

        pq.add(new iPair(0, 0)); // {weight, node}
        int sum = 0;

        while (!pq.isEmpty()) {
            iPair curr = pq.poll();
            int wt = curr.first;
            int node = curr.second;

            if (vis[node] == 1) continue; // Skip if already visited

            sum += wt;
            vis[node] = 1;

            for (Pair edge : adj.get(node)) {
                int currWt = edge.first;
                int currNode = edge.second;

                if (vis[currNode] == 0) {
                    pq.add(new iPair(currWt, currNode));
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of vertices:");
        int n = sc.nextInt();

        System.out.println("Enter the number of edges:");
        int e = sc.nextInt();

        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter edges (u, v, w) respectively:");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            adj.get(u).add(new Pair(w, v));
            adj.get(v).add(new Pair(w, u));
        }

        System.out.println("Minimum Sum of MST using Prim's Algorithm is: " + prims(adj, n));
    }
}
