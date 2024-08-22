class Solution {
    public static boolean isSafe(char board[][],int row ,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
}
        //diagonal left up 
         for(int i=row-1,j=col-1;j>=0&&i>=0;j--,i--){
            if(board[i][j]=='Q'){
                return false;
            }
}
        //diagnol right up 
         for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
}
        return true;
        
    }
      public static void ArrangeNQueen(char board[][],int row,List<List<String>>result){
          if(row==board.length){
             result.add(printBoard(board));
              
              return;
          
          }
          //Column loop
          for(int col=0;col<board.length;col++){
              if(isSafe(board,row,col)){
                   board[row][col] = 'Q';
              ArrangeNQueen(board,row+1,result);
              board[row][col] = '.';
                  
              }
             
}
          
       
      }
//    public static List<String> printBoard(char[][] board) {
//     List<String> printboard = new ArrayList<>();
    
//     for (int i = 0; i < board.length; i++) {
//         StringBuilder row = new StringBuilder();  // Create a StringBuilder for each row
//         for (int j = 0; j < board[i].length; j++) {
//             row.append(board[i][j]);  // Efficiently append each character
//         }
//         printboard.add(row.toString());  // Convert the row to a String and add to the list
//     }
    
//     return printboard;
// }
public static List<String> printBoard(char[][] board) {
    List<String> printBoard = new ArrayList<>();
    for (int i = 0; i < board.length; i++) {
        String row = "";
        for (int j = 0; j < board[i].length; j++) {
            row += board[i][j]; // Append each character to the row string
        }
        printBoard.add(row); // Add the constructed row to the list
    }
    return printBoard;
}

    public   List<List<String>> solveNQueens(int n) {
        List<List<String>>result = new ArrayList<>();
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        ArrangeNQueen(board,0,result);
        return result;
        
    }
}