package clgJAVA;
import java.util.*;

public class DijkstrasA {
    static int totalvertex = 5;

    // Finds the vertex with the minimum distance that is not visited
    public static int min(int[] distance, Boolean[] vis) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < totalvertex; i++) {
            if (!vis[i] && distance[i] <= min) {
                min = distance[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Prints the shortest distances
    public void printSol(int[] distance) {
        System.out.println("Shortest distances from source 0:");
        for (int i = 0; i < totalvertex; i++) {
            if (distance[i] == Integer.MAX_VALUE) {
                System.out.println("To " + i + ": Unreachable");
            } else {
                System.out.println("To " + i + ": " + distance[i]);
            }
        }
    }

    // Implements Dijkstra's algorithm
    public void dijkstra(int[][] graph, int source) {
        int[] distance = new int[totalvertex];
        Boolean[] vis = new Boolean[totalvertex];
        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(vis, false);

        distance[source] = 0;

        for (int count = 0; count < totalvertex - 1; count++) {
            int currentVertex = min(distance, vis);
            vis[currentVertex] = true;

            for (int neighborVertex = 0; neighborVertex < totalvertex; neighborVertex++) {
                if (!vis[neighborVertex] && graph[currentVertex][neighborVertex] != Integer.MAX_VALUE &&
                        distance[currentVertex] != Integer.MAX_VALUE &&
                        distance[currentVertex] + graph[currentVertex][neighborVertex] < distance[neighborVertex]) {
                    distance[neighborVertex] = distance[currentVertex] + graph[currentVertex][neighborVertex];
                }
            }
        }
        printSol(distance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] graph = new int[totalvertex][totalvertex];

        System.out.println("Enter the adjacency matrix (use " + Integer.MAX_VALUE + " for no direct edge):");
        for (int i = 0; i < totalvertex; i++) {
            for (int j = 0; j < totalvertex; j++) {
                System.out.println("Enter weight of edge from vertex " + i + " to vertex " + j + ":");
                graph[i][j] = sc.nextInt();
            }
        }

        DijkstrasA dijkstra = new DijkstrasA();
        dijkstra.dijkstra(graph, 0);
    }
}
