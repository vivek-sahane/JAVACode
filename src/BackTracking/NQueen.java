package BackTracking;
import java.util.*;
public class NQueen {
        private boolean isSafe(char[][] board, int row, int col) {
            int n = board.length;

            // Check row -> East and West
            for (int j = 0; j < n; j++) {
                if (board[row][j] == 'Q') return false;
            }

            // Check col -> North and South
            for (int i = 0; i < n; i++) {
                if (board[i][col] == 'Q') return false;
            }

            // Check North East
            int i = row;
            int j = col;
            while (i >= 0 && j < n) {
                if (board[i][j] == 'Q') return false;
                i--;
                j++;
            }

            // Check South East
            i = row;
            j = col;
            while (i < n && j < n) {
                if (board[i][j] == 'Q') return false;
                i++;
                j++;
            }

            // Check South West
            i = row;
            j = col;
            while (i < n && j >= 0) {
                if (board[i][j] == 'Q') return false;
                i++;
                j--;
            }
            return true;
        }

        private void nqueen(char[][] board, int row, List<List<String>> ans, Set<String> seen) {
            int n = board.length;
            if (row == -1) { // Base case, all queens are placed
                // Convert 2D char array into a string representation
                StringBuilder sb = new StringBuilder();
                for (char[] rowArray : board) {
                    sb.append(rowArray);
                }
                String boardString = sb.toString();

                // Add to answer if not seen before
                if (!seen.contains(boardString)) {
                    seen.add(boardString);
                    List<String> l = new ArrayList<>();
                    for (int i = 0; i < n; i++) {
                        l.add(new String(board[i]));
                    }
                    ans.add(l);
                }
                return;
            }

            for (int j = 0; j < n; j++) {
                if (isSafe(board, row, j)) {
                    board[row][j] = 'Q';
                    nqueen(board, row - 1, ans, seen); // Recursion, place queens from last row to first row
                    board[row][j] = '.'; // Backtrack
                }
            }
        }

        public List<List<String>> solveNQueens(int n) {
            char[][] board = new char[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    board[i][j] = '.';
                }
            }
            List<List<String>> ans = new ArrayList<>();
            Set<String> seen = new HashSet<>(); // To store seen configurations
            nqueen(board, n - 1, ans, seen); // Start placing queens from the last row
            return ans;
        }
    }


