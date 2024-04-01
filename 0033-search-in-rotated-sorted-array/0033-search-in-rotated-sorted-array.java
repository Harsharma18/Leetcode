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
            if(nums[mid]== target){
                 // if mid points to the target
                return mid;
            }
            //check array is sorted or not
            // if left part is sorted
            if(nums[left]<=nums[mid]){
                if(nums[left]<=target && target<=nums[mid]){
                    // element exists
                    right = mid-1;
                }else{
                     // element does not exist
                    left = mid+1;
                }
                
            }else{// if right part is sorted
                if(nums[mid]<=target && target<=nums[right]){
                    // element exists
                    left=mid+1;
                }else{
                    // element does not exist
                    right = mid-1;
                }
                
            }
            
        }
       return -1;
    }
}