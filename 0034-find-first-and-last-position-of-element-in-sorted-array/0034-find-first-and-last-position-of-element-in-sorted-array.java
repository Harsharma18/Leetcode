class Solution {
    public int[] searchRange(int[] nums, int target) {
        //o(n)time and o(1)space
        int n = nums.length;
        int first = -1;
        int last = -1;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                first =i;
                last=i;
                break;
                
            }
        }

         if (first != -1) {
            while (last + 1 < n && nums[last + 1] == target) {
                last++;
            }
            return new int[]{first, last}; // Return the range of occurrences
        }  
        return new int[]{-1,-1};
    }
}