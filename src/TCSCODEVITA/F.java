package TCSCODEVITA;


import java.util.*;

public class F {

    // Helper function to calculate possible moves for the Queen
    public static Set<String> getQueenMoves(String position) {
        Set<String> moves = new HashSet<>();
        char column = position.charAt(0);
        int row = Integer.parseInt(position.substring(1));

        // Horizontal and Vertical moves
        for (int i = 1; i <= 8; i++) {
            moves.add("" + column + i);  // Vertical moves
            moves.add("" + (char) (64 + i) + row);  // Horizontal moves
        }

        // Diagonal moves (top-left, top-right, bottom-left, bottom-right)
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (Math.abs(column - (char) (64 + i)) == Math.abs(row - j)) {
                    moves.add("" + (char) (64 + i) + j);
                }
            }
        }

        moves.remove(position); // Remove the initial position
        return moves;
    }

    // Helper function to calculate possible moves for the Rook
    public static Set<String> getRookMoves(String position) {
        Set<String> moves = new HashSet<>();
        char column = position.charAt(0);
        int row = Integer.parseInt(position.substring(1));

        // Horizontal and Vertical moves
        for (int i = 1; i <= 8; i++) {
            moves.add("" + column + i);  // Vertical moves
            moves.add("" + (char) (64 + i) + row);  // Horizontal moves
        }

        moves.remove(position); // Remove the initial position
        return moves;
    }

    // Helper function to calculate possible moves for the Bishop
    public static Set<String> getBishopMoves(String position) {
        Set<String> moves = new HashSet<>();
        char column = position.charAt(0);
        int row = Integer.parseInt(position.substring(1));

        // Diagonal moves (top-left, top-right, bottom-left, bottom-right)
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (Math.abs(column - (char) (64 + i)) == Math.abs(row - j)) {
                    moves.add("" + (char) (64 + i) + j);
                }
            }
        }

        moves.remove(position); // Remove the initial position
        return moves;
    }

    // Function to calculate the number of unique positions after 'd' plies
    public static int calculateUniquePositions(List<String> pieces, int d) {
        Set<String> positions = new HashSet<>();
        Set<String> currentPositions = new HashSet<>(pieces);

        for (int moveCount = 0; moveCount < d; moveCount++) {
            Set<String> nextPositions = new HashSet<>();

            // For each piece on the board, get its possible moves and add them to the next positions
            for (String position : currentPositions) {
                char pieceType = position.charAt(0);
                Set<String> possibleMoves = new HashSet<>();

                if (pieceType == 'Q') {
                    possibleMoves = getQueenMoves(position);
                } else if (pieceType == 'R') {
                    possibleMoves = getRookMoves(position);
                } else if (pieceType == 'B') {
                    possibleMoves = getBishopMoves(position);
                }

                nextPositions.addAll(possibleMoves);
            }

            currentPositions = nextPositions;
            positions.addAll(currentPositions);
        }

        return positions.size();
    }

    // Main function to take input and print output
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the positions of the pieces
        String piecesLine = scanner.nextLine();
        String[] piecesArray = piecesLine.split(" ");
        List<String> pieces = Arrays.asList(piecesArray);

        // Read the ply depth
        int d = scanner.nextInt();

        // Calculate and print the number of unique positions
        int result = calculateUniquePositions(pieces, d);
        System.out.println(result);
    }
}
