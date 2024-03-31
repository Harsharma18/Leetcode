class Solution {
    public int search(int[] nums, int target) {
        //o(n)time and o(1)space 
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==target){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }
        
        //o(logn) time and o(1) space 
        int left =0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            //check array is sorted or not
            if(nums[left]<=nums[mid]){
                if(nums[left]<=target && target<=nums[mid]){
                    right = mid-1;
                    
                }else{
                    left = mid+1;
                }
            }else{
                if(nums[mid]<=target && target<=nums[right]){
                    left = mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}