import java.util.Arrays;

class Solution {

    public static final int MOD = 1_000_000_007;

    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] power = new int[n];
        power[0] = 1;

        // Precompute powers of 2 mod MOD
        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1]<<1) % MOD;
        }

        int left = 0;
        int right = n - 1;
        int result = 0;

        // Two-pointer approach
        while (left <= right) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else {
                result = (result + power[right - left]) % MOD;
                left++;
            }
        }

        return result;
    }
}
