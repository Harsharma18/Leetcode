class Solution {
    public static void helper(String str, int open, int close, List<String> gp, int n) {  
        if (open == n && close == n) {
            gp.add(str);
            return;
        }
        // Add open parenthesis if open < n
        if (open < n) {
            helper(str + "(", open + 1, close, gp, n);
        }
        // Add close parenthesis if close < open
        if (close < open) {
            helper(str + ")", open, close + 1, gp, n);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> gp = new ArrayList<>();
        helper("", 0, 0, gp, n);
        return gp;
    }
}
