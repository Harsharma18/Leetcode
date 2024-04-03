class Solution {
    public int findPeakElement(int[] nums) {
//       //  o(n)time and o(1)space 
//         int n = nums.length;
//         for(int i = 0; i < n; i++) {
//             // Check if nums[i] is a peak
//             if ((i == 0 || nums[i] > nums[i - 1]) && (i == n - 1 || nums[i] > nums[i + 1])) {
//                 return i; // Return index of the peak element
//             }
//         }
        
//         return -1; // No peak element found
//     }
// }
        
        //o(logn) time using binary search and (1) space complexity
        
        int n = nums.length;
       int left =1;
        int right = n-2;
        //Edge Cases
        if(n==1){
            return 0;
        }
        if(nums[n-1]>nums[n-2]){
            return n-1;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }else if(nums[mid]>nums[mid-1]){
                left = mid+1;
                
            }else if(nums[mid]>nums[mid+1]){
                right = mid-1;
            }else{
                left=mid+1;
                //or
              //  right = mid-1;
            }
        }
        return -1;
    }
}
        