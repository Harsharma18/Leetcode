public class Solution {
    public int countGoodNumbers(long n) {
        int MOD = 1000000007;
        long count = 1;
        long a = powMod(5, (n + 1) / 2, MOD);
        long b = powMod(4, n / 2, MOD);
        count = (a * b) % MOD;
        return (int) count;
    }

    // Helper method to calculate (x^y) % mod
    private long powMod(long x, long y, int mod) {
        long result = 1;
        while (y > 0) {
            if (y % 2 != 0) {
                result = (result * x) % mod;
            }
            x = (x * x) % mod;
            y /= 2;
        }
        return result;
    }
}
