package TCSCODEVITA;

import java.util.*;

public class G {

    // Directions corresponding to "u", "d", "f", "b", "l", "r"
    static int[] dy = {-1, 1, 0, 0, 0, 0}; // u, d, f, b, l, r
    static int[] dx = {0, 0, 1, -1, 1, -1}; // u, d, f, b, l, r
    static int[] dz = {0, 0, 0, 0, -1, 1}; // u, d, f, b, l, r

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int S = scanner.nextInt(); // Cube size
        int x1 = scanner.nextInt(), y1 = scanner.nextInt(), z1 = scanner.nextInt(); // Starting position of Band 1
        String band1 = scanner.next(); // Movement sequence for Band 1

        int x2 = scanner.nextInt(), y2 = scanner.nextInt(), z2 = scanner.nextInt(); // Starting position of Band 2
        String band2 = scanner.next(); // Movement sequence for Band 2

        // Initialize the 3D matrices for the two bands
        boolean[][][] band1Positions = new boolean[S][S][S];
        boolean[][][] band2Positions = new boolean[S][S][S];

        // Place Band 1
        placeBand(band1Positions, x1, y1, z1, band1, S);

        // Place Band 2
        placeBand(band2Positions, x2, y2, z2, band2, S);

        // Check for interlocking and calculate the overlap
        int overlap = calculateOverlap(band1Positions, band2Positions, S);

        if (overlap == -1) {
            System.out.println("Impossible");
        } else {
            System.out.println(overlap);
        }

        scanner.close();
    }

    // Function to place a band in the 3D matrix
    public static void placeBand(boolean[][][] bandPositions, int x, int y, int z, String movements, int S) {
        bandPositions[x][y][z] = true; // Place the first unit cube of the band

        for (char move : movements.toCharArray()) {
            int direction = -1;
            if (move == 'u') direction = 0;
            else if (move == 'd') direction = 1;
            else if (move == 'f') direction = 2;
            else if (move == 'b') direction = 3;
            else if (move == 'l') direction = 4;
            else if (move == 'r') direction = 5;

            // Move to the next position
            int newX = x + dx[direction];
            int newY = y + dy[direction];
            int newZ = z + dz[direction];

            // Check if the new position is within bounds
            if (newX >= 0 && newX < S && newY >= 0 && newY < S && newZ >= 0 && newZ < S) {
                x = newX;
                y = newY;
                z = newZ;
                // Mark the position as occupied by the band
                bandPositions[x][y][z] = true;
            } else {
                // If the movement goes out of bounds, you can either skip it or stop placing further
                System.out.println("Movement goes out of bounds. Invalid move.");
                return;
            }
        }
    }

    // Function to calculate the maximum number of cells one band is above another
    public static int calculateOverlap(boolean[][][] band1Positions, boolean[][][] band2Positions, int S) {
        int maxOverlap = 0;

        boolean interlocked = false;

        for (int x = 0; x < S; x++) {
            for (int y = 0; y < S; y++) {
                for (int z = 0; z < S; z++) {
                    if (band1Positions[x][y][z] && band2Positions[x][y][z]) {
                        interlocked = true;
                    }
                    if (band1Positions[x][y][z]) {
                        // Count how many cells Band 1 is above Band 2
                        int count = 0;
                        if (band2Positions[x][y][z]) count++;
                        maxOverlap = Math.max(maxOverlap, count);
                    }
                }
            }
        }

        return interlocked ? -1 : maxOverlap;
    }
}
