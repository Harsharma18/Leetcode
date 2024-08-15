class Solution {
    public static final  String[] keyPad = {
         "",    // 0
        "",    // 1
        "abc", // 2
        "def", // 3
        "ghi", // 4
        "jkl", // 5
        "mno", // 6
        "pqrs",// 7
        "tuv", // 8
        "wxyz" // 9
    };
   public static void helper(List<String>result,String letters){
       List<String>newResult = new ArrayList<>();
       for(int i=0;i<result.size();i++){
           String combination = result.get(i);
           for(int j=0;j<letters.length();j++){
               newResult.add(combination+letters.charAt(j));
           }
       }
       result.clear();
       result.addAll(newResult);
           
   
   }
    public List<String> letterCombinations(String digits) {
        List<String>result = new ArrayList<>();
        if(digits==null || digits.isEmpty()){
            return result;
}
        result.add("");
        for(int i=0;i<digits.length();i++){
            int digit = digits.charAt(i)-'0';  //convert charactger into                  integer and finding which we want 
            String letters = keyPad[digit];
            helper(result,letters);
        
            
            
        }
        return result;
        
    }
}