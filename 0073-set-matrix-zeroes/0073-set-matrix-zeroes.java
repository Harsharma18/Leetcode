public class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        // Flags to indicate whether the first row and column should be set to zero
        boolean firstRowZero = false;
        boolean firstColZero = false;
        
        // Check if the first row contains zero
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }
        
        // Check if the first column contains zero
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }
        
        // Iterate through the matrix and use the first row and column to mark zeros
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;  // Mark the corresponding row
                    matrix[0][j] = 0;  // Mark the corresponding column
                }
            }
        }
        
        // Nullify rows based on values in the first column
        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                nullifyRow(matrix, i);
            }
        }
        
        // Nullify columns based on values in the first row
        for (int j = 1; j < n; j++) {
            if (matrix[0][j] == 0) {
                nullifyColumn(matrix, j);
            }
        }
        
        // Nullify the first row if needed
        if (firstRowZero) {
            nullifyRow(matrix, 0);
        }
        
        // Nullify the first column if needed
        if (firstColZero) {
            nullifyColumn(matrix, 0);
        }
    }
    
    // Helper method to set a row to zeros
    private void nullifyRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[row][j] = 0;
        }
    }
    
    // Helper method to set a column to zeros
    private void nullifyColumn(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }
}
