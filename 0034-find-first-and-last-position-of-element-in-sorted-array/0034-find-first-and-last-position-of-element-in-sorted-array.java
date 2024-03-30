class Solution {
    public int[] searchRange(int[] nums, int target) {
        // O(n) time and O(1) space
        int n = nums.length;
        int first = -1;
        int last = -1;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i; // Set first occurrence
                }
                last = i; // Update last occurrence
            }
        }
        
        if (first != -1) {
            return new int[]{first, last}; // Return the range of occurrences
        }
        
        return new int[]{-1, -1}; // Target element not found
    }
}
