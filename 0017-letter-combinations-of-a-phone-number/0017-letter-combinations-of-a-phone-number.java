class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        String[] digitMap = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(result, digits, 0, new StringBuilder(), digitMap);
        return result;
    }
    
    private void backtrack(List<String> result, String digits, int index, StringBuilder sb, String[] digitMap) {
        if (index == digits.length()) {
            result.add(sb.toString());
            return;
        }
        
        int digit = digits.charAt(index) - '0';
        String letters = digitMap[digit];
        for (char c : letters.toCharArray()) {
            sb.append(c);
            backtrack(result, digits, index + 1, sb, digitMap);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
