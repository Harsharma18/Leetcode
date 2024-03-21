public class Solution {
    public int subarraySum(int[] nums, int k) {//o(n2)time and o(1) space
        int len= 0;
        for (int i = 0; i < nums.length; i++) {
            int sum=0;
            for (int j =i; j< nums.length; j++) {
                sum+=nums[j];
                if (sum == k)
                   len++;
            }
        }
        return len;
         
       
    }
}
