class Solution {
    public int search(int[] nums, int target) {
        //o(n)time and o(1)space 
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}