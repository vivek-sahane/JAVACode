package TCSCODEVITA;

import java.util.*;

public class C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read dimensions and number of rotations
        int N = sc.nextInt();
        int K = sc.nextInt();

        // Read cube faces
        char[][][] cube = new char[6][N][N];
        for (int face = 0; face < 6; face++) {
            for (int row = 0; row < N; row++) {
                for (int col = 0; col < N; col++) {
                    cube[face][row][col] = sc.next().charAt(0);
                }
            }
        }

        // Read rotations
        sc.nextLine(); // Consume newline
        String[] rotations = new String[K];
        for (int i = 0; i < K; i++) {
            rotations[i] = sc.nextLine();
        }

        // Read side, row, column to determine the selected color
        String[] query = sc.nextLine().split(" ");
        String selectedSide = query[0];
        int selectedRow = Integer.parseInt(query[1]) - 1;
        int selectedCol = Integer.parseInt(query[2]) - 1;

        // Simulate cube rotations
        for (String rotation : rotations) {
            cube = performRotation(cube, rotation);
        }

        // Determine the face index based on the selected side
        int faceIndex = switch (selectedSide) {
            case "base" -> 0;
            case "back" -> 1;
            case "top" -> 2;
            case "front" -> 3;
            case "left" -> 4;
            case "right" -> 5;
            default -> -1;
        };

        // Output the selected color
        System.out.println(cube[faceIndex][selectedRow][selectedCol]);
    }

    private static char[][][] performRotation(char[][][] cube, String rotation) {
        char[][][] newCube = new char[6][][];

        for (int i = 0; i < 6; i++) {
            newCube[i] = copyFace(cube[i]);
        }

        switch (rotation) {
            case "turn left":
                rotateFaceLeft(newCube[2]);
                rotateFaceRight(newCube[0]);
                copyEdges(cube, newCube, new int[]{3, 4, 1, 5});
                break;

            case "turn right":
                rotateFaceRight(newCube[2]);
                rotateFaceLeft(newCube[0]);
                copyEdges(cube, newCube, new int[]{3, 5, 1, 4});
                break;

            case "rotate front":
                rotateFaceRight(newCube[4]);
                rotateFaceLeft(newCube[5]);
                copyEdges(cube, newCube, new int[]{2, 0, 1, 3});
                break;

            case "rotate back":
                rotateFaceLeft(newCube[4]);
                rotateFaceRight(newCube[5]);
                copyEdges(cube, newCube, new int[]{2, 3, 1, 0});
                break;

            case "rotate left":
                rotateFaceLeft(newCube[3]);
                rotateFaceRight(newCube[1]);
                copyEdges(cube, newCube, new int[]{2, 4, 0, 5});
                break;

            case "rotate right":
                rotateFaceRight(newCube[3]);
                rotateFaceLeft(newCube[1]);
                copyEdges(cube, newCube, new int[]{2, 5, 0, 4});
                break;
        }

        return newCube;
    }

    private static char[][] copyFace(char[][] face) {
        int N = face.length;
        char[][] newFace = new char[N][N];
        for (int i = 0; i < N; i++) {
            System.arraycopy(face[i], 0, newFace[i], 0, N);
        }
        return newFace;
    }

    private static void rotateFaceLeft(char[][] face) {
        int N = face.length;
        char[][] temp = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                temp[N - j - 1][i] = face[i][j];
            }
        }
        for (int i = 0; i < N; i++) {
            System.arraycopy(temp[i], 0, face[i], 0, N);
        }
    }

    private static void rotateFaceRight(char[][] face) {
        int N = face.length;
        char[][] temp = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                temp[j][N - i - 1] = face[i][j];
            }
        }
        for (int i = 0; i < N; i++) {
            System.arraycopy(temp[i], 0, face[i], 0, N);
        }
    }

    private static void copyEdges(char[][][] cube, char[][][] newCube, int[] edges) {
        int N = cube[0].length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                newCube[edges[0]][i][j] = cube[edges[1]][i][j];
                newCube[edges[1]][i][j] = cube[edges[2]][i][j];
                newCube[edges[2]][i][j] = cube[edges[3]][i][j];
                newCube[edges[3]][i][j] = cube[edges[0]][i][j];
            }
        }
    }
}
