class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     
        // Initialize a list to store all subsets
           List<List<Integer>> ans = new ArrayList<>(); 
        // Calculate total number of subsets (2^nums.length)
        int subsets = 1 << nums.length;  
        // Iterate through all possible subsets (from 0 to subsets - 1)
        for (int i = 0; i < subsets; i++) {  
             // Initialize a list to store current subset
            List<Integer> list = new ArrayList<>(); 
            // Iterate through each element in nums array
            for (int j = 0; j < nums.length; j++) {  
                // Check if jth bit of i is set
                if ((i & (1 << j)) != 0) {  
                     // Add nums[j] to the current subset if the jth bit is set
                    list.add(nums[j]); 
                }
            }
            // Add current subset to the final list of subsets
            
            ans.add(list);  
        }
        // Return the list of all subsets
        return ans;  
    }
}
