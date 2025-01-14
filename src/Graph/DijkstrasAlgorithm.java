package Graph;

import java.util.*;

class Pair2 {
    int node;
    int distance;

    public Pair2(int distance, int node) {
        this.node = node;
        this.distance = distance;
    }
}

class DijkstrasAlgorithm {

    public static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
        // Create a priority queue for storing the nodes as a pair {dist, node}
        PriorityQueue<Pair2> pq = new PriorityQueue<Pair2>((x, y) -> x.distance - y.distance);

        int[] dist = new int[V];
        Arrays.fill(dist, (int)(1e9));  // Initialize distances with a large number
        dist[S] = 0;
        pq.add(new Pair2(0, S));

        while (!pq.isEmpty()) {
            int dis = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();

            for (int i = 0; i < adj.get(node).size(); i++) {
                int edgeWeight = adj.get(node).get(i).get(1);
                int adjNode = adj.get(node).get(i).get(0);

                if (dis + edgeWeight < dist[adjNode]) {
                    dist[adjNode] = dis + edgeWeight;
                    pq.add(new Pair2(dist[adjNode], adjNode));
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {

    }
}
