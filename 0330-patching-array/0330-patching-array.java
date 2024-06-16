class Solution {
    public int minPatches(int[] nums, int n) {
        int patches = 0;
        long miss = 1; // The smallest number that is not covered by the current nums array
        int i = 0;
        
        while (miss <= n) {
            if (i < nums.length && nums[i] <= miss) {
                miss += nums[i++];
            } else {
                miss += miss;
                patches++;
            }
        }
        
        return patches;
    }
}
