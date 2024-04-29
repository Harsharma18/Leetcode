class Solution {
    public void rotate(int[][] matrix) {
        
        //o(n2)time and 0(1)space 
        // int n = matrix.length;
        // int m = matrix[0].length;
        
//         //convert into transpose matrix;row to column and column to row
//         for(int i=0;i<n-1;i++){
//             for(int j=i+1;j<m;j++){
//                 //Swap
//             int temp = matrix[i][j];
//             matrix[i][j] = matrix[j][i];
//             matrix[j][i]= temp;
//             }
//         }
//         //reverse  the transpose matrix 
//         for(int i=0;i<n;i++){
//             int left = 0;
//             int right = m-1;
//             while(left<right){
//                 int temp = matrix[i][left];
//                 matrix[i][left] = matrix[i][right];
//                 matrix[i][right] = temp;
//                 left++;
//                 right--;
//             }
//         }
        
//     }
// }
        
        //o(n2)time and space 
         int n = matrix.length;
        int m = matrix[0].length;
        int ans[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[j][n-1-i] = matrix[i][j];
            }
        }
           for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = ans[i][j];
            }
           }
        
    }
}