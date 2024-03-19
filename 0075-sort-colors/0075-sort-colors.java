class Solution {
    public void sortColors(int[] nums) {
//         int count0 = 0;
//         int count1 = 0;
//         int count2 = 0;
//         for(int i=0;i<nums.length;i++){
//              if(nums[i]==0){
//             count0++;
//         }
//         if(nums[i]==1){
//             count1++;
//         }
//         if(nums[i]==2){
//             count2++;
//         }
            
//         }
       
//         for(int i=0;i<count0;i++){
//             nums[i]=0;
//         }
//          for(int i=count0;i<count1+count0;i++){
//             nums[i]=1;
//         }
//          for(int i=count0+count1;i<nums.length;i++){
//             nums[i] = 2;
//         }
        
      int low = 0;
        int high = nums.length - 1;
        int mid = 0; //not mid it is pointer
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 2) {
                 int temp1 = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp1;
                high--;
                
            } else { // nums[mid] == 1
                mid++;
               
            }
        
            
        }
        
        
    }
          
        
}