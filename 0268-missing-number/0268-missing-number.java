class Solution {
    public int missingNumber(int[] nums) {
        boolean isfound[] = new boolean[nums.length];
       
        for(int i=0;i<nums.length;i++){
              if(nums[i]>=0 && nums[i]<nums.length){
                  isfound[nums[i]] = true;
              }
        
        }
           //find missing number 
        for(int i=0;i<isfound.length;i++){
           if(!isfound[i]){
                return i;
            }  
        }
           
      return nums.length;
        
        
    }
}