class Solution {
  
    public static void goodString(int n,String curr,int open ,int close,List<String>res){
       
        
        if(open==n && close==n){
            res.add(curr);
            
        }
        //add open
        if(open<n){
            goodString(n,curr+"(" ,open+1,close,res);
        }
    //add close 
        if(close<open){
           goodString(n,curr+")" ,open,close+1,res);
        }
        
    }
    public List<String>generateParenthesis(int n) {
        List<String>res = new ArrayList<>();
        goodString(n,"",0,0,res);
        return res;
        
    }
}
    
