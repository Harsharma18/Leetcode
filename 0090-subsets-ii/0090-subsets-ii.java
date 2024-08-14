class Solution {
    public static void helper(List<Integer>arr,List<Integer>currList,List<List<Integer>>res,int index){
        res.add(new ArrayList<>(currList));
        for(int i=index;i<arr.size();i++){
            if(i>index && arr.get(i).equals(arr.get(i-1))){
                continue;
            }
             currList.add(arr.get(i));
            helper(arr,currList,res,i+1);
            currList.remove(currList.size()-1);
            
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>res = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer>arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        helper(arr,new ArrayList<>(),res,0);
        return res;
    }
}