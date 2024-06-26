class Solution {
    public int[] findPeakGrid(int[][] mat) {
        //o(n*m)time and o(1)space
        // Get the number of rows and columns in the matrix
//         int n = mat.length; // Number of rows
//         int m = mat[0].length; // Number of columns
        
//         // Iterate through each element of the matrix
//         for(int i = 0; i < n; i++) {
//             for(int j = 0; j < m; j++) {
//                 // Check if the current element is greater than its neighbors
//                 boolean isPeak = true; // Assume current element is a peak
//                 if(i > 0 && mat[i][j] < mat[i - 1][j]) {
//                     isPeak = false; // Check above neighbor
//                 }
//                 else if(i < n - 1 && mat[i][j] < mat[i + 1][j]) {
//                     isPeak = false; // Check below neighbor
//                 }
//                 else if(j > 0 && mat[i][j] < mat[i][j - 1]) {
//                     isPeak = false; // Check left neighbor
//                 }
//                 else if(j < m - 1 && mat[i][j] < mat[i][j + 1]) {
//                     isPeak = false; // Check right neighbor
//                 }
                
//                 // If the current element is a peak, return its coordinates
//                 if(isPeak) {
//                     return new int[]{i, j}; // Return coordinates of the peak
//                 }
//             }
//         }
        
//         // If no peak is found, return {-1, -1}
//         return new int[]{-1, -1};
//     }
// }
        // O(n * log(m))time and o(1)space
        
       int n = mat.length;
        int m = mat[0].length;
        int left = 0;
        int right = m - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int row = rowNumber(n, m, mat, mid);
            int leftVal = mid - 1 >= 0 ? mat[row][mid - 1] : -1;
            int rightVal = mid + 1 < m ? mat[row][mid + 1] : -1;
            if (mat[row][mid] > leftVal && mat[row][mid] > rightVal) {
                return new int[]{row, mid};
            } else if (mat[row][mid] < leftVal) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static int rowNumber(int n, int m, int[][] matrix, int col) {
        int maxValue = Integer.MIN_VALUE; // Initialize maxValue with the minimum possible value
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (matrix[i][col] > maxValue) {
                maxValue = matrix[i][col]; // Update maxValue with the new maximum value found
                index = i;
            }
        }
        return index;
    }
}