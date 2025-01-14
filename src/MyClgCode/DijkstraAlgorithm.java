package MyClgCode;

import java.util.*;

class Pair {
    int first, second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class iPair {
    int first, second;

    public iPair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class DijkstraAlgorithm {

    public static int[] dijkstraA(List<List<Pair>> adj, int[] dis, int src) {
        dis[src] = 0;
        PriorityQueue<iPair> pq = new PriorityQueue<>((a, b) -> a.first - b.first);
        pq.add(new iPair(0, 0));

        while (!pq.isEmpty()) {
            int dist = pq.peek().first;
            int node = pq.peek().second;
            pq.poll();

            for (Pair curr : adj.get(node)) {
                int currdis = curr.first;
                int currnode = curr.second;
                if (currdis + dist < dis[currnode]) {
                    dis[currnode] = currdis + dist;
                    pq.add(new iPair(dis[currnode], currnode));
                }
            }
        }
        return dis;
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

        System.out.println("Enter the edges (u, v, w) one by one:");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            adj.get(u).add(new Pair(w, v));
            adj.get(v).add(new Pair(w, u)); // Remove for directed graphs
        }

        int[] dis = new int[n];
        Arrays.fill(dis, Integer.MAX_VALUE);

        System.out.println("Enter the source node (between 0 and " + (n - 1) + "):");
        int src = sc.nextInt();

        dijkstraA(adj, dis, src);

        System.out.println("Shortest distances from node " + src + ":");
        for (int i = 0; i < n; i++) {
            if (dis[i] == Integer.MAX_VALUE) {
                System.out.println("Node " + i + ": Unreachable");
            } else {
                System.out.println("Node " + i + ": " + dis[i]);
            }
        }
    }

}
