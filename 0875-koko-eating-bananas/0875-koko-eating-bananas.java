class Solution {
    public int minEatingSpeed(int[] piles, int h) {
          int low = 1, high = Integer.MIN_VALUE;
        int n = piles.length;
        
        // Find the maximum number of bananas
        for (int i = 0; i < n; i++) {
            high = Math.max(high, piles[i]);
        }

        // Apply binary search
        while (low <= high) {
            int mid = (low + high) / 2;
            int sum = 0;
            
            // Calculate total hours
            for (int i = 0; i < n; i++) {
                sum += Math.ceil((double) piles[i] / (double) mid);
            }
            
            // Adjust the search boundaries
            if (sum <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return low;
        
    }
}