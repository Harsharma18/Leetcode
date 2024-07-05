class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        
        double ans = 1;
        double  absN = Math.abs((double)n);
        
        while (absN > 0) {
            if (absN % 2 == 1) {
                ans *= x;
                absN = absN-1;
            }
            x *= x;
            absN /= 2;
        }
        
        return n < 0 ? 1.0 / ans : ans;
    }
}
