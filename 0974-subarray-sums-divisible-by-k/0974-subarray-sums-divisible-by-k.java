class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0, sum = 0;
        int[] freq = new int[k];
        freq[0] = 1; // handle the case where subarray sum is divisible by k
        
        for (int num : nums) {
            sum += num;
            int rem = sum % k;
            if (rem < 0) {
                rem += k;
            }
            count += freq[rem];
            freq[rem]++;
        }
        
        return count;
    }
}
