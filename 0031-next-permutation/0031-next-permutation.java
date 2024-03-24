class Solution {
    public void nextPermutation(int[] nums) {
        
        // o(n) time  and o(1)
       int n = nums.length;
        int index = -1;
        // Find break point
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        if(index==-1){
            reverse(nums,0,n-1);
        }else{
              // Find slightly greater element 
       
            for (int j = n - 1; j > index; j--) {
                if (nums[j] > nums[index]) {
                    // int temp = nums[j];
                    // nums[j] = nums[index];
                    // nums[index] = temp;
                    // break;
                    swap(nums,index,j);
                    break;
                }
            }
            
    
        
      
        
         // Reverse the elements from index+1 to the end
        reverse(nums,index+1,n-1);
    }
    }
        
       
        public static void reverse(int nums[],int left,int right){
             while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        }
            public static void swap(int nums[],int start,int end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
            
        
}