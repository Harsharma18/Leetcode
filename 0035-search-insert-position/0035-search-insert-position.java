class Solution {
    public int searchInsert(int[] nums, int target) {
        //o(logn) time and o(1) space complexity
          int n = nums.length; // size of the array
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (nums[mid] >= target) {
                ans = mid;
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
 
    }
}