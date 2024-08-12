//0(2^n*k)time and o(n*k) space
class Solution {
    public static void helper(int arr[],int target,int index,List<List<Integer>>res,List<Integer>currList){
        if(index==arr.length){
            if(target==0){
                res.add(new ArrayList<>(currList)); //not takeo(1) it take o(n)
            }
            return;
        }
       
        //include picked up
       if(arr[index]<=target){
           currList.add(arr[index]);
           helper(arr,target-arr[index],index,res,currList);
           currList.remove(currList.size()-1); //backtrack
       }
         //exclude  not pick
        helper(arr,target,index+1,res,currList);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>>res = new ArrayList<>();
        helper(candidates,target,0,res,new ArrayList<>());
        return res;
        
    }
}