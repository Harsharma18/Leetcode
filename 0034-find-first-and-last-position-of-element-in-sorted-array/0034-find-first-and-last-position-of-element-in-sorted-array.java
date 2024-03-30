class Solution {
    public int[] searchRange(int[] nums, int target) {
//         // O(n) time and O(1) space
//         int n = nums.length;
//         int first = -1;
//         int last = -1;
        
//         for (int i = 0; i < n; i++) {
//             if (nums[i] == target) {
//                 if (first == -1) {
//                     first = i; // Set first occurrence
//                 }
//                 last = i; // Update last occurrence
//             }
//         }
        
//         if (first != -1) {
//             return new int[]{first, last}; // Return the range of occurrences
//         }
        
//         return new int[]{-1, -1}; // Target element not found
//     }
// }
        
        //or
//            int n = nums.length;
//         int first = -1;
//         int last = -1;
        
//         for (int i = 0; i < n; i++) {
//             if (nums[i] == target) {
//                 first = i;
//                 last = i;
//                 break;
//             }
//         }
        
//         if (first != -1) {
//             while (last < n && nums[last] == target) {
//                 last++;
//             }
//             return new int[]{first, last-1}; // Return the range of occurrences
//         }
        
//         return new int[]{-1, -1}; // Target element not found
//     }
// }
        
        //o(logn)time and o(1)space complexity using lower and upper bound 
        
        int lb = lowerBound(nums,target);
        int ub = upperBound(nums,target);
        if(lb== nums.length || nums[lb]!=target){
            return new int[]{-1,-1};
}
        return new int[]{lb,ub-1};
    }
     public static int lowerBound(int nums[],int x){
        int left=0;
        int right = nums.length-1;
            int ans = nums.length;
            while(left<=right){
                int mid = (left+right)/2;
                if(nums[mid]>=x){
                    ans = mid;
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            return ans;
        }
         public static int upperBound(int nums[],int x){
        int left=0;
        int right = nums.length-1;
            int ans = nums.length;
            while(left<=right){
                int mid = (left+right)/2;
                if(nums[mid]>x){
                    ans = mid;
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
             return ans;
        }
}