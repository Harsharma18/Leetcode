class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> result = new ArrayList<>();
        if (num == null || num.length() == 0) {
            return result;
        }
        backtrack(result, num, target, 0, 0, 0, "");
        return result;
    }

    private void backtrack(List<String> result, String num, int target, int start, long eval, long prev, String expr) {
        if (start == num.length()) {
            if (eval == target) {
                result.add(expr);
            }
            return;
        }

        for (int i = start; i < num.length(); i++) {
            if (i != start && num.charAt(start) == '0') {
                break;
            }
            long curr = Long.parseLong(num.substring(start, i + 1));
            if (start == 0) {
                backtrack(result, num, target, i + 1, curr, curr, curr + "");
            } else {
                backtrack(result, num, target, i + 1, eval + curr, curr, expr + "+" + curr);
                backtrack(result, num, target, i + 1, eval - curr, -curr, expr + "-" + curr);
                backtrack(result, num, target, i + 1, eval - prev + prev * curr, prev * curr, expr + "*" + curr);
            }
        }
    }
}
