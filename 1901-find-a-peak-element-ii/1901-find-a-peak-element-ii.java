class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                boolean isPeak = true;
                if(i>0 && mat[i][j]<mat[i-1][j]){
                    isPeak = false;
                }
                else if(i<n-1 && mat[i][j]<mat[i+1][j]){
                    isPeak = false;
                }
                else if(j>0 && mat[i][j]<mat[i][j-1]){
                    isPeak = false;
                }
                else if(j<m-1 && mat[i][j]<mat[i][j+1]){
                    isPeak = false;
                }
                if(isPeak==true){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
       
    }
}      