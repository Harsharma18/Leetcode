import java.util.Arrays;

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int mod = 1000000007;
        int[] subarraySums = new int[n * (n + 1) / 2];
        int index = 0;

        // Generate all subarray sums
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                subarraySums[index++] = sum;
            }
        }

        // Sort the subarray sums
        Arrays.sort(subarraySums);

        // Calculate the range sum from left to right
        long totalSum = 0;
        for (int i = left - 1; i < right; i++) {
            totalSum = (totalSum + subarraySums[i]) % mod;
        }

        return (int) totalSum;
    }
}
