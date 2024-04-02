class Solution {
    public int singleNonDuplicate(int[] nums) {
        //o(n) time and O(1)space 
          int n = nums.length; // Size of the array.
        if (n == 1)
            return nums[0];

        for (int i = 0; i < n; i++) {
            // Check for first index:
            if (i == 0) {
                if (nums[i] != nums[i + 1])
                    return nums[i];
            }
            // Check for last index:
            else if (i == n - 1) {
                if (nums[i] != nums[i - 1])
                    return nums[i];
            } else {
                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1])
                    return nums[i];
            }
        }

        // Dummy return statement:
        return -1;
    }
        
}

        //o(logn)time and o(1)space 
//         int n = nums.length;
       
//         if (n == 1) {
//             return nums[0];
//         }
//         if (nums[0] != nums[1]) {
//             return nums[0];
//         }
//         if (nums[n - 1] != nums[n - 2]) {
//             return nums[n - 1];
//         }
        
//         int start = 1;
//         int end = n - 2;
        
//         while (start <= end) {
//             int mid = (start + end) / 2;
            
//             if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
//                 return nums[mid];
//             }
            
//               if (mid % 2 == 1) {
//                 // If mid is odd, then the single element is to the right
//                 if (nums[mid] == nums[mid - 1]) {
//                     start = mid + 1;
//                 } else {
//                     end = mid - 1;
//                 }
//             } else {
//                 // If mid is even, then the single element is to the right
//                  if (mid % 2 == 0) {
//                 // If mid is odd, then the single element is to the right
//                 if (nums[mid] == nums[mid +1]) {
//                     start = mid + 1;
//                 } else {
//                     end = mid - 1;
//                 }
//             }
//             }
//         }
        
//         return -1; // This line should never be reached if input is valid
//     }
// }
