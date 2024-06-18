class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int[] best = new int[100001];
        
        // Iterate through the job difficulties and profits, and keep track of the maximum profit for each difficulty level
        for (int i = 0; i < n; i++) {
            best[difficulty[i]] = Math.max(best[difficulty[i]], profit[i]);
        }
        
        // Iterate through the difficulty levels and fill in the best profit for each level
        for (int i = 1; i < 100001; i++) {
            best[i] = Math.max(best[i], best[i - 1]);
        }
        
        // Iterate through the workers and find the maximum profit they can earn
        int totalProfit = 0;
        for (int w : worker) {
            totalProfit += best[w];
        }
        
        return totalProfit;
    }
}
