class Solution {
    public double myPow(double x, int n) {
        // Base case: if the exponent is 0, return 1.0
        // Time complexity: O(1)
        if (n == 0) {
            return 1.0;
        }

        double ans = 1;  // Initialize answer
        double N = Math.abs((double)n);  // Take the absolute value of n
        // Space complexity: O(1), constant extra space used for ans and N

        // Loop to calculate x^n
        // Time complexity: O(log n), since we are dividing N by 2 in each iteration
        while (N > 0) {
            if (N % 2 == 1) {  // If N is odd, multiply ans by x
                ans = ans * x;
                N = N - 1;
            }
            x = x * x;  // Square the base
            N = N / 2;  // Divide N by 2
        }

        // If n is negative, return the reciprocal of ans
        // Time complexity: O(1)
        return n < 0 ? 1.0 / ans : ans;
    }
}
