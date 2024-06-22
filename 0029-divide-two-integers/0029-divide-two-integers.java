class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor==dividend){
            return 1;
        }
         long  ans =0;
        boolean sign = true;
        if((dividend>0 && divisor<0) || (dividend<0 && divisor>0)){
            sign = false;
        }
        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        while(n>=d)
        {
           int  count =0;
         while(n>=(d<<count+1)){ //d*(2^count+1)
             count=count+1;
          
         }
               ans= ans+(1<<count);
             n = n-(d<<count);
            
        }
        //for overflow cases 
        if(ans<=( 1<<31 )&& sign){
            return Integer.MAX_VALUE;
        }
        if(ans<=(1<<31) && !sign){
            return Integer.MIN_VALUE;
        }
        return sign ? (int)ans:-(int)ans;
    }
}