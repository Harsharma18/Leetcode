class Solution {
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        int  fibN1 = fib(n-1);
        int fibN2 = fib(n-2);
      int   fn = fibN1+fibN2;
        return fn;
       
    
            
    
    
    
        
    }
}