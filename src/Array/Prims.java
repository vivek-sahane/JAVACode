package Array;
import java.util.*;

public class Prims {
    public static void prims(int[][] G, int v) {
        int minCost = 0;
        int edge = 1;
        boolean[] visited = new boolean[v];
        Arrays.fill(visited, false);
        visited[0] = true;

        while (edge < v) {
            int min = Integer.MAX_VALUE;
            int a = -1, b = -1;

            for (int i = 0; i < v; i++) {
                if (visited[i]) {
                    for (int j = 0; j < v; j++) {
                        if (!visited[j] && G[i][j] < min) {
                            min = G[i][j];
                            a = i;
                            b = j;
                        }
                    }
                }
            }

            if (a != -1 && b != -1) {
                System.out.println("Edge " + (edge++) + ": (" + a + ", " + b + ") cost: " + min);
                minCost += min;
                visited[b] = true;
            }
        }

        System.out.println("Minimum cost of spanning tree: " + minCost);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int v = sc.nextInt();
        int[][] cost = new int[v][v];

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.println("Enter the cost between vertex " + i + " and " + j + " (or 'INF' for infinity):");
                String input = sc.next();
                if (input.equals("INF")) {
                    cost[i][j] = Integer.MAX_VALUE;
                } else {
                    cost[i][j] = Integer.parseInt(input);
                }
            }
        }

        prims(cost, v);
    }
}
