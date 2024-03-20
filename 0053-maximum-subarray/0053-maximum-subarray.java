class Solution {
    public int maxSubArray(int[] nums) {//o(n) time and o(1) space complexity
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
       
        for(int i=0;i<n;i++){
            
            
            if (currSum >= 0) {
                currSum = Math.max(nums[i],currSum+nums[i]);
              
              
             } else {
                currSum = nums[i];
             }
            //
           
            if(currSum>maxSum){
                maxSum = currSum;
                 
            }
        }
        
        return maxSum;
     
        
        
    }
}
