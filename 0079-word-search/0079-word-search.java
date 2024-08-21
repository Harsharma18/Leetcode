class Solution {
    public static boolean dfs(char[][] board,int curr, String word,boolean visited[][],int r,int c){
        //base case
        if(curr==word.length()){
            return true;
        }
        int rows = board.length;
        int cols = board[0].length;
        if(r<0 || c<0 || r>=rows||c>=cols||visited[r][c]|| board[r][c]!=word.charAt(curr)){
            return false;
            
}
    visited[r][c] = true;
        boolean found = false;
        if(dfs(board,curr+1,word,visited,r,c+1)){
            found=true;
        }
        else if(dfs(board,curr+1,word,visited,r,c-1)){
            found = true;
        }
                 else if(dfs(board,curr+1,word,visited,r+1,c)){
            found = true;
        }   
                         
                 else if(dfs(board,curr+1,word,visited,r-1,c)){
            found = true;
        }     
       
                         visited[r][c] = false;
                         return found;
         
        
}
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean visited[][]=  new boolean[rows][cols];
            for(int i=0;i<rows;i++){
          for(int j=0;j<cols;j++){
 if(board[i][j] == word.charAt(0) && dfs(board,0,word,visited,i,j)){
           return true;
              }
              
             
          }
        }
        
        return false;
    }
    
}