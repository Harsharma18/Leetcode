import java.util.ArrayList;
import java.util.List;

class Solution {
    
    public static void helper(int k, int n, int index, List<Integer> currList, List<List<Integer>> res) {
        // Base case: if we have k numbers and their sum is n, add the combination to result
        if (currList.size() == k && n == 0) {
            res.add(new ArrayList<>(currList));
            return;
        }

        // Base case: if we have more than k numbers or the sum exceeds the target, return
        if (currList.size() > k || n < 0) {
            return;
        }

        // Iterate through numbers from index to 9
        for (int i = index; i <= 9; i++) {
            currList.add(i);  // Include the number
            helper(k, n - i, i + 1, currList, res);  // Recursive call with updated parameters
            currList.remove(currList.size() - 1);  // Backtrack
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        helper(k, n, 1, new ArrayList<>(), res);  // Start from number 1
        return res;
    }
}
