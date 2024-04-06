class Solution {
    public static boolean isPossible(int arr[],int day,int m ,int k){
        int count =0;
        int noOfBqet = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }else{
                noOfBqet = noOfBqet+(count/k);
                count = 0;
            }
        }
        noOfBqet = noOfBqet+(count/k);
        if(noOfBqet>=m){
            return true;
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(  (long)m*k>bloomDay.length){
            return -1;
        }
         int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }
          //binary Search 
        int left = mini;
        int right = maxi;
        while(left<=right){
            int mid=(left+right)/2;
            if (isPossible(bloomDay,mid, m , k)){
                right = mid-1;
            }else{
                left = mid+1;}
        }
        
        return left;
    }
}