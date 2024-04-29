class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<m;j++){
                //Swap
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i]= temp;
            }
        }
        //reverse 
        for(int i=0;i<n;i++){
            int left = 0;
            int right = m-1;
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        
    }
}