class Solution {
    public int maxArea(int[] height) {
        // int maxWater = 0;
        // for(int i=0;i<height.length;i++){
        //     for(int j=i+1;j<height.length;j++){
        //         int wh = Math.min(height[i],height[j]);
        //         int width = j-i;
        //         int area= wh*width;
        //         maxWater = Math.max(maxWater,area);
        //     }
        // }
        // return  maxWater;
        int lp=0;
        int rp = height.length-1;
        int maxWater  = 0;
        while(lp<rp){
            int ht = Math.min(height[lp],height[rp]);
            int width= rp-lp;
            int currWater = width*ht;
            maxWater = Math.max(currWater,maxWater);
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
         
        
        }
        return maxWater;
        
    }
}