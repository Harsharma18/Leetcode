class Solution {
    public  long  MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        //how  many index i s even or odd
        long even = (n+1)/2;  
        long  odd = n/2;
        long evenPlace = pow(5,even)%MOD;
        long  oddPlace = pow(4,odd)%MOD;
          return (int)((evenPlace*oddPlace) % MOD);
         
    }
    public long  pow( long x,long m){
        if(m==0) return 1;
        long temp = pow(x,m/2);
        if(m%2==0){
            return (temp*temp)% MOD;
        }else{
            return (x*temp*temp)% MOD;
        }
        
       
        
    }
}