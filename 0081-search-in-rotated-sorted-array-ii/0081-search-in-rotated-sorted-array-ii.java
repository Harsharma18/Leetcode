class Solution {
    public boolean search(int[] nums, int target) {
        
        //o(n)time and o(1)space
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==target){
//                 return true;
//             }
//         }
//         return false;
//     }
// }
        
        //o(logn)time and o(1)space complexity
          int left =0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]== target){
                 // if mid points to the target
                return true;
            }
            //edge case for duplicate if left ==mid== right
            if(nums[left]==nums[mid] && nums[mid]==nums[right]){
                left = left+1;
                right = right-1;
                continue;
            }
            //check array is sorted or not
            // if left part is sorted
            if(nums[left]<=nums[mid]){
              //  Check if the array is sorted in the segment [left, mid].
                if(nums[left]<=target && target<=nums[mid]){
                    // element exists
                    right = mid-1;
                }else{
                     // element does not exist
                    left = mid+1;
                }
                
            }else{// if right part is sorted
               // If target lies within the sorted segment [mid, right]
                if(nums[mid]<=target && target<=nums[right]){
                    // element exists
                    left=mid+1;
                }else{
                    // element does not exist
                    right = mid-1;
                }
                
            }
            
        }
       return false;
    }
}