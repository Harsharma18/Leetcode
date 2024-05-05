class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //o(n+log(m))time and o(1)space 
//         int n = matrix.length;
//         int m = matrix[0].length;
//         for(int i=0;i<n;i++){
//             int left =0;
//             int right = m-1;
//             while(left<=right){
//                 int mid = (left+right)/2;
//                 if(matrix[i][mid]==target){
//                     return true;
//                 }else if(matrix[i][mid]<target){
//                     left = mid+1;
//                 }else{
//                     right = mid-1;
//                 }
//             }
//         }
//         return false;
//     }
// }
        
        //o(n+m)time and o(1)space 
        int n = matrix.length;
        int m = matrix[0].length;
        int row = n-1;
        int col =0;
        while(row>=0 && col<matrix[0].length){
        if(matrix[row][col]==target){
            return true;
        }else if(matrix[row][col]<target){
            col++;
        }else{
            row--;
        }
        }
        return false;
    }
}