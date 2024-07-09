class Solution {
    public double myPow(double x, int n) {
        return myPow(x, (long) n);
    }

    private double myPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        if (n < 0) {
            return 1.0 / myPow(x, -n);
        }
        double halfPower = myPow(x, n / 2);
        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return halfPower * halfPower * x;
        }
    }
}
