class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = n - 2;
        
        // Find break point
        while (index >= 0 && nums[index] >= nums[index + 1]) {
            index--;
        }
        
        // If break point is found
        if (index >= 0) {
            // Find smallest element greater than nums[index] from the right
            int j = n - 1;
            while (j >= 0 && nums[j] <= nums[index]) {
                j--;
            }
            
            // Swap nums[index] and nums[j]
            int temp = nums[index];
            nums[index] = nums[j];
            nums[j] = temp;
        }
        
        // Reverse the elements from index+1 to the end
        int left = index + 1;
        int right = n - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
