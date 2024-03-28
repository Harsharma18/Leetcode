class Solution {
    public int findPeakElement(int[] nums) {
         int left = 0;
        int right =nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if mid is a peak
            if (nums[mid] > nums[mid + 1]) {
                right = mid; // Peak might be on the left side
            } else {
                left = mid + 1; // Peak might be on the right side
            }
        }

        return left; // or right, as left will be equal to right when loop breaks
    }

        
    
}