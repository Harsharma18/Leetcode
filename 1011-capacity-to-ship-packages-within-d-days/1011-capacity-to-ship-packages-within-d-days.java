class Solution {
    public int shipWithinDays(int[] weights, int days) {
      //using binary search   O(N * log(sum(weights[]) - max(weights[]) + 1))
       int left = Integer.MIN_VALUE;
        int right  = 0;
        for(int i=0;i<weights.length;i++){
            left = Math.max(left,weights[i]);
            right =  right+weights[i];
        }
        while(left<=right){
            int mid = (left+right)/2;
            int load =0;
            int day =1;
            for(int i=0;i<weights.length;i++){
                if(load+weights[i]>mid){
                    day = day+1;
                    load = weights[i];
                }else{
                    load = load+weights[i];
                }
            }
            if(day<=days){
            right = mid-1;
            }else{
                left = mid+1;
            }
            
        }
        return left;
    }
}
            
        
    
