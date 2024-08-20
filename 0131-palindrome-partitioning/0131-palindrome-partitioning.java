class Solution {
    public static void helper(String s , List<List<String>>result,List<String>palindrome, int index){
        if(index==s.length()){
         result.add(new ArrayList<>(palindrome));
            return;
        }
        for(int i=index;i<s.length();i++){
            String substring = s.substring(index,i+1);
            if(isPalindrome(substring)){
                palindrome.add(substring);
                 helper(s,result,palindrome,i+1);
                palindrome.remove(palindrome.size()-1);    
                
            } 
            
        }
        
}
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
          if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
           
            
        }
         return true;
    }

    public List<List<String>> partition(String s) {
        List<List<String>>result = new ArrayList<>();
        helper(s,result,new ArrayList<>(),0);
        return result;
        
        
    }
}