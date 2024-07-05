class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        
        double ans = 1;
        long absN = Math.abs((long)n); // Use long to handle the edge case for Integer.MIN_VALUE
        
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
