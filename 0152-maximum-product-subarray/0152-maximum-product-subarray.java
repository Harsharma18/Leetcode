class Solution {
    public int maxProduct(int[] nums) {
      
        
        //o(n2) time and o(1) space 
//         int n=nums.length;
//         int maxProd = Integer.MIN_VALUE;
       
//      for (int i = 0; i < n; i++) {
//             int prod = 1; // Reset prod to 1 for each i
//             for (int j = i; j < n; j++) {
//                   prod =prod* nums[j];
//                 maxProd = Math.max(prod, maxProd);
//             }
//         }
      
//       return maxProd;
        
//     }
// }
        
        //o(n) time and o(1) space 
        int preffix =1;
    int suffix =1;
    int n = nums.length;
    int max = Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        if(preffix==0){
             preffix =1;
        }
            
       
        if(suffix==0){
         suffix=1;
        }
            preffix = preffix*nums[i];
            suffix = suffix*nums[n-i-1];
        
       
        max= Math.max(max,Math.max(preffix,suffix));
    }
    return max;
}
}