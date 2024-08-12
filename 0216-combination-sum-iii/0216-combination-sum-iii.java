class Solution {
    public static void helper(int n,int k,int index,List<Integer>currList,List<List<Integer>>res){
        if(n==0 && currList.size()==k){
         res.add(new ArrayList<>(currList));
        }
        if(currList.size()>k || n<0){
            return;
        }
        for(int i=index;i<=9;i++)
        {
            currList.add(i);
            helper(n-i,k,i+1,currList,res);
            currList.remove(currList.size()-1);
        }
        
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
       List<List<Integer>>res = new ArrayList<>();
        helper(n,k,1,new ArrayList<>(),res);
        return res;
        
    }
}