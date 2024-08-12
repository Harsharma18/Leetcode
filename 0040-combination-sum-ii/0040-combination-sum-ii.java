import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void helper(int arr[], int target, int index, List<List<Integer>> res, List<Integer> currList) {
        // Base case: If target is 0, add current list to result
        if (target == 0) {
            res.add(new ArrayList<>(currList)); // Copy current list
            return;
        }

        // Iterate through candidates starting from index
        for (int i = index; i < arr.length; i++) {
            // Skip duplicates
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }
            // If the current element exceeds the target, no need to continue
            if (arr[i] > target) {
                break;
            }

            // Include the current element
            currList.add(arr[i]);
            // Recursive call with updated target and index
            helper(arr, target - arr[i], i + 1, res, currList);
            // Backtrack: remove the last element
            currList.remove(currList.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates); // Sort to handle duplicates
        helper(candidates, target, 0, res, new ArrayList<>());
        return res;
    }
}
