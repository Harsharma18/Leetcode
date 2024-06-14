class Solution {
    public int minIncrementForUnique(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        // Sort the input array in ascending order
        Arrays.sort(nums);
        
        int totalIncrement = 0;
        int prevNum = nums[0];
        
        // Iterate through the sorted array
        for (int i = 1; i < nums.length; i++) {
            // If the current number is less than or equal to the previous number,
            // increment the current number to make it unique
            if (nums[i] <= prevNum) {
                totalIncrement += prevNum - nums[i] + 1;
                prevNum++;
            } else {
                // If the current number is greater than the previous number,
                // update the previous number to the current number
                prevNum = nums[i];
            }
        }
        
        return totalIncrement;
    }
}
