class Solution {
    public int divide(int dividend, int divisor) {
        // Handle the case where the divisor is zero
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }

        // Handle the case where the dividend is the minimum integer value and the divisor is -1
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        boolean isNegative = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);

        // Convert the dividend and divisor to positive values
        long absoluteDividend = Math.abs((long) dividend);
        long absoluteDivisor = Math.abs((long) divisor);

        // Perform the division
        long result = 0;
        while (absoluteDividend >= absoluteDivisor) {
            long temp = absoluteDivisor;
            int shift = 1;
            while ((temp << 1) <= absoluteDividend) {
                temp <<= 1;
                shift <<= 1;
            }
            absoluteDividend -= temp;
            result += shift;
        }

        // Apply the sign of the result
        return isNegative ? (int) -result : (int) result;
    }
}
