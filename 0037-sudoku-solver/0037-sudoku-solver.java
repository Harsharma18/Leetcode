class Solution {
    public static boolean isSafe(char board[][], int row, int col, char digit) {
        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == digit) {
                return false;
            }
        }

        // Check row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == digit) {
                return false;
            }
        }

        // Check 3x3 sub-grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean helperSudoku(char board[][], int row, int col) {
        // Base case: if we've reached beyond the last row
        if (row == 9) {
            return true;
        }

        // Determine the next cell to process
        int nextRow = row;
        int nextCol = col + 1;
        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // If the cell is already filled, move to the next one
        if (board[row][col] != '.') { // Assuming empty cells are marked with '.'
            return helperSudoku(board, nextRow, nextCol);
        }

        // Try placing each digit in the current cell
        for (char digit = '1'; digit <= '9'; digit++) {
            if (isSafe(board, row, col, digit)) {
                board[row][col] = digit;
                if (helperSudoku(board, nextRow, nextCol)) {
                    return true;
                }
                board[row][col] = '.'; // Backtracking
            }
        }

        return false; // No valid digit was found, backtrack
    }

    public void solveSudoku(char[][] board) {
        helperSudoku(board, 0, 0);
    }
}
