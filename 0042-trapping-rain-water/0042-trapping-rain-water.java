class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n <= 2) // No trapping possible if there are less than 3 elements
            return 0;

        int[] left = new int[n];
        left[0] = height[0];

        // Calculate the max height from the left side
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        int[] right = new int[n];
        right[n - 1] = height[n - 1];

        // Calculate the max height from the right side
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        int trappedWater = 0;
        // Calculate the trapped water
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(left[i], right[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }
}
