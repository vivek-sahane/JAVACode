package TCSCODEVITA;

import java.util.*;

public class E {

    static int N, M, K;
    static char[][] matrix;
    static boolean[][] visited;

    // Directions for up, down, left, right movement
    static int[] rowDir = {-1, 1, 0, 0};
    static int[] colDir = {0, 0, -1, 1};

    // Helper function to check if a cell is within bounds
    static boolean isValid(int r, int c) {
        return r >= 0 && r < N && c >= 0 && c < M;
    }

    // BFS function to find the farthest reachable stable cells
    static List<int[]> farthestReach(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {startX, startY, 0}); // row, col, distance
        visited[startX][startY] = true;

        List<int[]> reachableCells = new ArrayList<>();

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1], dist = curr[2];

            // Skip if this cell is a building
            if (matrix[x][y] == 'B') {
                continue;
            }

            // If the current distance exceeds K, stop exploring further
            if (dist > K) {
                continue;
            }

            // Check if the cell is a stable cell (empty cell or last row)
            if (matrix[x][y] == 'E' && x != N - 1) {
                reachableCells.add(new int[] {x, y});
            }

            // Explore four possible directions
            for (int i = 0; i < 4; i++) {
                int newX = x + rowDir[i];
                int newY = y + colDir[i];

                if (isValid(newX, newY) && !visited[newX][newY]) {
                    // Apply gravity rule
                    if (matrix[newX][newY] == 'E' && newX != N - 1 && matrix[newX + 1][newY] != 'B') {
                        continue; // Ignore if we fall without building support
                    }

                    visited[newX][newY] = true;
                    queue.offer(new int[] {newX, newY, dist + 1});
                }
            }
        }

        return reachableCells;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size and K
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading integers

        matrix = new char[N][M];
        visited = new boolean[N][M];

        int startX = -1, startY = -1;

        // Read the matrix
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < M; j++) {
                matrix[i][j] = line.charAt(j);
                if (matrix[i][j] == 'S') {
                    startX = i;
                    startY = j;
                }
            }
        }

        // Input number of moves allowed
        K = sc.nextInt();

        // Get all reachable cells
        List<int[]> reachableCells = farthestReach(startX, startY);

        // If no reachable cells, print nothing
        if (reachableCells.isEmpty()) {
            return;
        }

        // Find the farthest reachable cell(s)
        int maxDist = -1;
        for (int[] cell : reachableCells) {
            int dist = Math.abs(cell[0] - startX) + Math.abs(cell[1] - startY);
            maxDist = Math.max(maxDist, dist);
        }

        // Print all farthest reachable cells
        for (int[] cell : reachableCells) {
            int dist = Math.abs(cell[0] - startX) + Math.abs(cell[1] - startY);
            if (dist == maxDist) {
                System.out.println(cell[0] + " " + cell[1]);
            }
        }

        sc.close();
    }
}
