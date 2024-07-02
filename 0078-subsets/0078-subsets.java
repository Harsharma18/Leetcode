class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int subsets = 1 << nums.length; // Total number of subsets
        
        for (int i = 0; i < subsets; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    list.add(nums[j]);
                }
            }
            ans.add(list);
        }
        
        return ans;
    }
}
