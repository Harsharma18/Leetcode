class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Check for edge cases
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int row = 0;
        int col = cols - 1;
        
        // Start from the top-right corner
        // If the current element is greater than target, move left
        // If the current element is less than target, move down
        while (row < rows && col >= 0) {
            if (matrix[row][col] == target)
                return true;
            else if (matrix[row][col] < target)
                row++;
            else
                col--;
        }
        
        return false;
    }
}
