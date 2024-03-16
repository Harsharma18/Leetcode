class Solution {
    public int findMaxConsecutiveOnes(int[] nums) { //o(n) time and o(1) space 
         int count =0;
            int maxCount = 0;
        for(int i=0;i<nums.length;i++){
           
           if(nums[i]==1){
               count++;
               maxCount = Math.max(count,maxCount);
           }else{
               count =0;
           }    
}
        
         
            return maxCount;
            
        
            
       
        
    }
}