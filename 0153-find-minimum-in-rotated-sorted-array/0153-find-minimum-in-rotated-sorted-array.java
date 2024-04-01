class Solution {
    public int findMin(int[] nums) {
//         int mini = Integer.MAX_VALUE;
//         //o(n)time and o(1)space 
//         for(int i=0;i<nums.length;i++){
//             mini = Math.min(mini,nums[i]);
//         }
        
       
//         return mini;
//     }
// }
        
        //o(logn) time and o(1) space
        int left =0;
        int right = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[left]<=nums[mid]){
                ans = Math.min(ans,nums[left]);
                left = mid+1;
                
            }else{
               ans =  Math.min(ans,nums[mid]);
                right = mid-1;
            }
        }
        return ans;
    }
}