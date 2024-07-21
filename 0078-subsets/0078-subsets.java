// // o(n*2^n) t.c and s.c
// class Solution {
//     // Method to return all subsets of the given array
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         int n = nums.length;
//         int totalSubsets = 1 << n; // Total number of subsets is 2^n

//         // Iterate over all possible combinations
//         for (int i = 0; i < totalSubsets; i++) {
//             List<Integer> subset = new ArrayList<>();
//             for (int j = 0; j < n; j++) {
//                 // Check if the j-th bit in i is set
//                 if ((i & (1 << j)) != 0) {
//                     subset.add(nums[j]);
//                 }
//             }
//             result.add(subset);
//         }

//         return result;
//     }
// }






//or
//class Solution {

//     public static void Subsets(List<List<Integer>> result, int nums[]) {
//         int n = nums.length;
//         int totalSubsets = 1 << n; // Total number of subsets is 2^n

//         // Iterate over all possible combinations
//         for (int i = 0; i < totalSubsets; i++) {
//             List<Integer> subset = new ArrayList<>();
//             for (int j = 0; j < n; j++) {
//                 // Check if the j-th bit in i is set
//                 if ((i & (1 << j)) != 0) {
//                     subset.add(nums[j]);
//                 }
//             }
//             result.add(subset);
//         }
//     }

//     // Method to return all subsets of the given array
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         Subsets(result, nums);
//         return result;
//     }
// }
//using recurson 
class Solution {
    // Helper method to generate all subsets using recursion
    private void helper(int[] nums, int index, List<Integer> curr, List<List<Integer>> res) {
        if (index == nums.length) {
            res.add(new ArrayList<>(curr)); // Add the current subset to the result
            return;
        }

        // Exclude the current element
        helper(nums, index + 1, curr, res);

        // Include the current element
        curr.add(nums[index]);
        helper(nums, index + 1, curr, res);
        curr.remove(curr.size() - 1); // Backtrack to remove the last element before returning
    }

    // Method to return all subsets of the given array
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), res); // Initialize the recursion with an empty list
        return res;
    }
}
