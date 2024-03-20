class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
       
        for(int i=0;i<n;i++){
            // currSum = Math.max(nums[i],currSum+nums[i]);
            
            if (currSum >= 0) {
                currSum = currSum + nums[i];
            } else {
                currSum = nums[i];
            }
           
            if(currSum>maxSum){
                maxSum = currSum;
                 
            }
        }
        
        return maxSum;
     
        
        
    }
}
