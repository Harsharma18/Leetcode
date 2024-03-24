class Solution {
    public void nextPermutation(int[] nums) {
//         int n = nums.length;
//         int index = n - 2;

//         // Find break point
//         while (index >= 0 && nums[index] >= nums[index + 1]) {
//             index--;
//         }

//         // If break point is found
//         if (index >= 0) {
//             // Find smallest element greater than nums[index] from the right
//             int smallestGreaterIndex = n - 1;
//             for (int j = n - 1; j > index; j--) {
//                 if (nums[j] > nums[index]) { // Only compare if greater, no need to compare with smallestGreaterIndex
//                     smallestGreaterIndex = j;
//                     break; // Since you found the smallest greater element, no need to continue the loop
//                 }
//             }

//             // Swap nums[index] and nums[smallestGreaterIndex]
//             int temp = nums[index];
//             nums[index] = nums[smallestGreaterIndex];
//             nums[smallestGreaterIndex] = temp;
//         }

        // // Reverse the elements from index+1 to the end
        // int left = index + 1;
        // int right = n - 1;
        // while (left < right) {
        //     int temp = nums[left];
        //     nums[left] = nums[right];
        //     nums[right] = temp;
        //     left++;
        //     right--;
       int n = nums.length;
        int index = -1;
        // Find break point
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        
        // Find slightly greater element 
        if (index != -1) {
            for (int j = n - 1; j > index; j--) {
                if (nums[j] > nums[index]) {
                    int temp = nums[j];
                    nums[j] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }
        }
        
        // Reverse the elements from index+1 to the end
        int left = index + 1;
        int right = n - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}