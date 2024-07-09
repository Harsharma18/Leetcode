class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
          
        
         if(n>0){
              double halfPower = myPow(x, n / 2);
        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return halfPower * halfPower * x;
        }
             
         }else{
              double halfPowerN = myPow(x, n / 2);
              if (n % 2 == 0) {
                   
            return halfPowerN * halfPowerN;
        } else {
            return halfPowerN * halfPowerN * 1/x;
        }
         }
       
    }
}
