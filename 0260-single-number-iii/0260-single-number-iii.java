class Solution {
    public int[] singleNumber(int[] nums) {
        // Arrays.sort(nums); if i write o(nlogn tc come )
        //o(n) time complexity and o(1)space complexity
         int xor = 0;
        for (int i = 0; i < nums.length; i++) {  // Find XOR of all elements
            xor = xor ^ nums[i];
        }
        // Calculate the two's complement
        int twosComplement = ~xor + 1;
        
        // Find the rightmost set bit
        int lowestBit = xor & twosComplement;
        
        //or
     //   int lowestBit = xor & -xor;  // Find the rightmost set bit
        
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {  // Separate numbers into two groups                                                     and XOR separately
            if ((lowestBit & nums[i]) == 0) {
                result[0] = result[0] ^ nums[i];
            } else {
                result[1] = result[1] ^ nums[i];
            }
        }
        
        return result;  // Return the result 
        
        
    }
}