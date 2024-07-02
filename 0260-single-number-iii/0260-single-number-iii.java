class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int xor = 0;
        for(int i=0;i<nums.length;i++){
             xor = xor^nums[i];

        }
        int lowestBit = xor & -xor;
        int result[] = new int[2];
        for(int i=0;i<nums.length;i++){
            if((lowestBit & nums[i] )==0){
                result[0] = result[0]^nums[i];
                
            }else{
                result[1] = result[1]^nums[i];
                
            }
        }
        return result;
        
        
    }
}