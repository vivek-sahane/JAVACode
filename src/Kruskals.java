import java.util.Scanner;

class Kruskals {
    static int v = 5;  // Number of vertices
    static int[] parent = new int[v];  // Array to store the parent of each vertex

    // Function to find the parent of a vertex with path compression
    static int find(int i) {
        if (parent[i] == i) {  // If the vertex is its own parent, return the vertex
            return i;
        }
        return parent[i] = find(parent[i]);  // Path compression: update the parent of the vertex
    }

    // Function to perform the union of two sets
    static void union(int i, int j) {
        int a = find(i);  // Find the root of the set containing i
        int b = find(j);  // Find the root of the set containing j
        parent[a] = b;  // Make the root of one set the parent of the other
    }

    // Function to perform Kruskal's algorithm to find the Minimum Spanning Tree (MST)
    static void kruskals(int[][] cost) {
        int sum = 0;  // Variable to store the total cost of the MST
        for (int i = 0; i < v; i++) {
            parent[i] = i;  // Initialize each vertex to be its own parent
        }

        int edgeCnt = 0;  // Counter to keep track of the number of edges in the MST

        // Loop until we have v-1 edges in the MST
        while (edgeCnt < v - 1) {
            int min = Integer.MAX_VALUE;  // Reset minimum weight for each iteration
            int x = -1, y = -1;  // Initialize variables to store the vertices of the edge

            // Find the smallest edge that does not form a cycle
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < v; j++) {
                    // Check if the vertices are in different sets and if the edge is the smallest found
                    if (find(i) != find(j) && cost[i][j] < min && cost[i][j] != 0) {
                        min = cost[i][j];  // Update minimum weight
                        x = i;  // Update the first vertex of the edge
                        y = j;  // Update the second vertex of the edge
                    }
                }
            }
            // If a valid edge was found, include it in the MST
            if (x != -1 && y != -1) {
                union(x, y);  // Union the sets containing the two vertices
                edgeCnt++;
                sum += min;
                System.out.println("Edge included: (" + x + ", " + y + ") with weight: " + min);
            }
        }

        System.out.println("Minimum cost: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        v = sc.nextInt();
        int[][] cost = new int[v][v];
        parent = new int[v];

        // Input the cost matrix
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.println("Enter the cost between vertex " + i + " and vertex " + j + " (enter 'inf' for infinity):");
                String input = sc.next();
                if (input.equals("inf")) {
                    cost[i][j] = Integer.MAX_VALUE;
                } else {
                    cost[i][j] = Integer.parseInt(input);
                }
            }
        }


        kruskals(cost);
    }
}
