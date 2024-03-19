class Solution {
    public int majorityElement(int[] nums) {
         
        int n = nums.length;
        int el=nums[0];
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                el = nums[i];
                count =1;
                
            }else if(el==nums[i]){
                count++;
                
}else{//nums[i]!=el
                count--;
            }
          
        }
        
        //for confirming majority el is greate then n/2
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el){
                count++;
                 
            }
             if(count>n/2){
                return el;
            }
         }
        
       
        return -1;
        
    }
}