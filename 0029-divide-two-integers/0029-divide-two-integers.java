class Solution {
    public int divide(int dividend, int divisor) {
        // Special case: handling overflow for Integer.MIN_VALUE / -1
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Special case: when dividend is equal to divisor
        if (divisor == dividend) {
            return 1;
        }

        long ans = 0;
        // Determine the sign of the result
        boolean sign = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0);
        
        // Convert both dividend and divisor to their absolute values and to long to avoid overflow
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        
        while (n >= d) {
            int count = 0;
            // Find the highest power of two such that (d * 2^count) <= n
            while (n >= (d << (count + 1))) {
                count++;
            }
            // Add the number of times d fits into n
            ans += (1L << count);
            // Subtract the corresponding multiple of d from n
            n -= (d << count);
        }

        // Adjust the sign of the result
        if (sign) {
            ans = -ans;
        }

        // Ensure the result fits in a 32-bit integer range
        if (ans > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (ans < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        
        return (int) ans;
    }
}
