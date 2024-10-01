class Solution {
    public boolean canArrange(int[] arr, int k) {
        // Create an array to count the remainders
        int[] count = new int[k];
        
        // Count the occurrences of each remainder
        for (int num : arr) {
            int remainder = ((num % k) + k) % k; // Ensure remainder is non-negative
            count[remainder]++;
        }
        
        // Check pairs of remainders
        for (int i = 1; i < (k + 1) / 2; i++) {
            if (count[i] != count[k - i]) {
                return false; // Mismatched pairs
            }
        }
        
        // Special case for remainder 0
        if (count[0] % 2 != 0) {
            return false; // Odd count of elements with remainder 0
        }
        
        // Special case for middle remainder if k is even
        if (k % 2 == 0 && count[k / 2] % 2 != 0) {
            return false; // Odd count of elements with remainder k/2
        }
        
        return true; // All checks passed
    }
}
