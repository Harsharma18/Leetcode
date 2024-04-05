class Solution {
    public static int findMax(int piles[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max = Math.max(max,piles[i]);
        }
        return max;
    }
    public static int calculateTotalHours(int[] piles, int hourly) {
        int totalH = 0;
        int n = piles.length;
        //find total hours:
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double)(piles[i]) / (double)(hourly));
        }
        return totalH;
    }
    public int minEatingSpeed(int[] piles, int h) {
          int left = 1;
        int right = findMax(piles);
        while(left<=right){
            int mid = (left+right)/2;
            int calculate = calculateTotalHours(piles, mid);
            if(calculate<=h){
                right=mid-1;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
}