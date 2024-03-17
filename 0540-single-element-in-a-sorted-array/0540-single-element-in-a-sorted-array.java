// class Solution {
//     public int singleNonDuplicate(int[] nums) {
//       int n= nums.length;
       
//         if(n==1){
//             return nums[0];
//         }
//         if(nums[0]!=nums[1]){
//             return nums[0];
//         }
//         if(nums[n-1]==nums[n-2]){
//             return nums[n-1];
//         }
//          int start = 1;
//         int end = nums.length-2;
        
        
         
//         while(start<end){
//             int mid = (start+end)/2;
             
//             if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
//                 return nums[mid];
//             }
//         //we are in left half and eleminate this because element found in right half 
//         if((mid%2==1 && nums[mid]==nums[mid-1]) ||(mid%2==0 &&  nums[mid]==nums[mid+1])){
//             start = mid+1;
//         }else{
//             end = mid-1;
            
//         }
            
//         }
//         return -1;
      
        
        
        
//     }
// }
class Solution {
     public int singleNonDuplicate(int[] nums) {
         int left = 0;
         int right = nums.length;

         while (left + 1 < right) {
             int mid = left + (right - left) / 2;

             if (nums[mid] != nums[mid - 1] && (mid + 1 == nums.length || nums[mid] != nums[mid + 1])) {
                 return nums[mid];
             } else if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 != 0 && nums[mid] == nums[mid - 1])) {
                 left = mid;
             } else {
                 right = mid;
             }
         }

         return nums[left];
     }
 }