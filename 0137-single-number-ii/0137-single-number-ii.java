class Solution {
    public int singleNumber(int[] nums) {
        //iteration = o(n) and sorting o(nlogn ) overall tc is o(nlogn) and space o(1)
//        Arrays.sort(nums);
//         for(int i=1;i<nums.length;i=i+3){
//             if(nums[i]!=nums[i-1]){
//                 return nums[i-1];
//             }
//         }
//         return nums[nums.length-1];
        
      //  o(n) time  complexty and o(1) space complexity 
              int ones = 0;
               int twos = 0;
        for(int i=0;i<nums.length;i++){
              ones = ((ones^nums[i]) & ~twos);
              twos = ((twos^ nums[i]) & ~ones);
        }
        return ones;
    }
}