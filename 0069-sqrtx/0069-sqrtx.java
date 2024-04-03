class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        int ans = 0;
        for (int i = 0; i <= x; i++) {
            long val = (long) i * i; // Using long to avoid overflow
            if (val <= x) {
                ans = i;
            } else {
                break;
            }
        }
        return ans;
    }
}
