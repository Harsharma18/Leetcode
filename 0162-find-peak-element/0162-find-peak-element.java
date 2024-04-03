class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
       
        for(int i = 0; i < n; i++) {
            // Check if nums[i] is a peak
            if ((i == 0 || nums[i] > nums[i - 1]) && (i == n - 1 || nums[i] > nums[i + 1])) {
                return i; // Return index of the peak element
            }
        }
        
        return -1; // No peak element found
    }
}
