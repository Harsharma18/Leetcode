class Solution {
    public int[] rearrangeArray(int[] nums) {//brute force o(n+n/2)time and space o(n)
        int n = nums.length;
        int pos[] = new int[n];
        int neg[] = new int[n];
       int  posindex = 0;
        int negindex =0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[posindex] = nums[i];
                posindex++;
            }else{
                neg[negindex] = nums[i];
                negindex++;
            }
        }
        for(int i=0;i<n/2;i++){
            nums[2*i] = pos[i];
            nums[2*i+1] = neg[i];
            
        }
        return nums;
        
        
        
        
        
        
        //Time Complexity and space complexity:O(n)
        // int n = nums.length;
        // int ans[] = new int[n];
        // int posindex =0;
        // int negindex =1;
        // for(int i=0;i<n;i++){
        //     if(nums[i]>0){
        //         ans[posindex] = nums[i];
        //         posindex = posindex+2;
        //     }else{
        //         ans[negindex] = nums[i];
        //         negindex = negindex+2;
        //     }
        // }
        // return ans;
        
        
    }
}