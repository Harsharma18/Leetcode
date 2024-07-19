import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();
        
        if (matrix.length == 0 || matrix[0].length == 0) {
            return luckyNumbers; // Return empty list if matrix is empty
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Find the minimums in each row
        for (int i = 0; i < rows; i++) {
            int rowMin = Integer.MAX_VALUE;
            int colIndex = -1;

            // Find the minimum value in the current row and its column index
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    colIndex = j;
                }
            }

            // Check if this minimum is the maximum in its column
            boolean isLucky = true;
            for (int k = 0; k < rows; k++) {
                if (matrix[k][colIndex] > rowMin) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                luckyNumbers.add(rowMin);
            }
        }

        return luckyNumbers;
    }
}
