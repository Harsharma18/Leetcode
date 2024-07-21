// class Solution {

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
class Solution {
    // Method to return all subsets of the given array
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int totalSubsets = 1 << n; // Total number of subsets is 2^n

        // Iterate over all possible combinations
        for (int i = 0; i < totalSubsets; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                // Check if the j-th bit in i is set
                if ((i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            result.add(subset);
        }

        return result;
    }
}