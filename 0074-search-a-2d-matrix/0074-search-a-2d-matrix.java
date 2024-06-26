class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //linear search  o(n*m)time and o(1)
//         int n = matrix.length;
//         int m  = matrix[0].length;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//              if(matrix[i][j]==target){
//                  return true;
//              }
//             }
//         }
//         return false;
        
//     }
// }
        //binary search time 0(n+log(m)) and o(1)space 
//       int n = matrix.length;
// int m = matrix[0].length;

// for (int i = 0; i < n; i++) {
//     if (matrix[i][0] <= target && target <= matrix[i][m - 1]) {
//         int left = 0;
//         int right = m - 1;
        
//         while (left <= right) {
//             int mid = left + (right - left) / 2; // Avoid potential overflow
            
//             if (matrix[i][mid] == target) {
//                 return true;
//             }
            
//             if (matrix[i][mid] < target) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }
//     }  

// return false;
//     }
// }
        //o(log(m*n)time and o(1)space 
        int n = matrix.length;
        int m =  matrix[0].length;
        int left = 0;
        int right = n*m-1;
        while(left<=right){
            int mid = (left+right)/2;
            int row =  mid/m;
            int col = mid%m;
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return false;
    }
}
        