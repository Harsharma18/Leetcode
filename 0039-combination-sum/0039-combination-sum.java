// //0(2^n*k)time and o(n*k) space
// class Solution {
//     public static void helper(int arr[],int target,int index,List<List<Integer>>res,List<Integer>currList){
//         if(index==arr.length){
//             if(target==0){
//                 res.add(new ArrayList<>(currList)); //not takeo(1) it take o(n)
//             }
//             return;
//         }
       
//         //include picked up
//        if(arr[index]<=target){
//            currList.add(arr[index]);
//            helper(arr,target-arr[index],index,res,currList);
//            currList.remove(currList.size()-1); //backtrack
//        }
//          //exclude  not pick
//         helper(arr,target,index+1,res,currList);
//     }
//     public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        List<List<Integer>>res = new ArrayList<>();
//         helper(candidates,target,0,res,new ArrayList<>());
//         return res;
        
//     }
// }
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    // Recursive helper function
    public static void helper(int[] arr, int target, int index, List<List<Integer>> res, List<Integer> currList) {
        // Base case: If target is 0, add current list to result
        if (target == 0) {
            res.add(new ArrayList<>(currList)); // Copy current list
            return;
        }
        
        // If we've considered all elements
        if (index == arr.length) {
            return;
        }
        
        // Skip elements that are greater than the target
        if (arr[index] > target) {
            return;
        }
        
        // Include the current element and move forward
        currList.add(arr[index]);
        helper(arr, target - arr[index], index, res, currList); // Index is not incremented to allow multiple uses of the same element
        currList.remove(currList.size() - 1); // Backtrack
        
        // Exclude the current element and move forward
        helper(arr, target, index + 1, res, currList); // Move to the next index to consider the next element
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates); // Sort to handle duplicates
        helper(candidates, target, 0, res, new ArrayList<>());
        return res;
    }
}
