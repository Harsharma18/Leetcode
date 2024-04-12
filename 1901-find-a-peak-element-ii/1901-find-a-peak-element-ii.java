public class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        int[] peakIndices = new int[2];
        int max = Integer.MIN_VALUE;
        
        // Search for the peak element
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] > max) {
                    max = mat[i][j];
                    peakIndices[0] = i;
                    peakIndices[1] = j;
                }
            }
        }
        
        return peakIndices;
    }
}
