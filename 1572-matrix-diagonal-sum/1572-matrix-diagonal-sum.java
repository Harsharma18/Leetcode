class Solution {
    public int diagonalSum(int[][] mat) {
        //o(n2)time and o(1)space
//         int n = mat.length;
//         int m = mat[0].length;
//         int sum =0;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
        
        //pd
//                 if(i==j){
//                     sum = sum+mat[i][j];
//                 }else if(i+j==m-1){ //sd
//                     sum += mat[i][j];
//                 }
                
//             }
//         }
//         return sum;
//     }
// }
        //time o(n) and o(1)space 
        int n = mat.length;
        int m = mat[0].length;
        int sum =0;
        for(int i=0;i<n;i++){
            //pd
            sum +=mat[i][i];
            //sd
            if(i!=mat.length-1-i){
                 sum+=mat[i][n-1-i];
            }
            
    
        }
        return sum;
    }
}