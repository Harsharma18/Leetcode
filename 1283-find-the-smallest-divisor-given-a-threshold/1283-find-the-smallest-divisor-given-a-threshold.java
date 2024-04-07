class Solution {
     public static int sumByD(int[] arr, int div) {
        int n = arr.length; //size of array
        //Find the summation of division values:
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double)(arr[i]) / (double)(div));
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        //Time Complexity: O(n * max)
         //Space Complexity: O(1)
//          int max = Integer.MIN_VALUE;
//         for (int i = 0; i < nums.length; i++) {
//             max = Math.max(max, nums[i]);
//         }
        
//         for (int th = 1; th <= max; th++) {
//             int sum = 0;
//             for (int j = 0; j < nums.length; j++) {
//                 sum += Math.ceil((double) nums[j] / th);
//             }
//             if (sum <= threshold) {
//                 return th;
//             }
//         }
//         return -1;
//     }
// }
        //binary Search O(log(max(arr[]))*N),time and space is o(1)
     int left = 1;
     int right = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            right = Math.max(right,nums[i]);
        }
        while(left<=right){
            int mid =  (left+right)/2;
            // int sum =0;
            // for(int i=0;i<nums.length;i++){
            //     sum += Math.ceil((double)nums[i]/(double)mid);
            // }
            // if(sum<=threshold){
            //     right = mid-1;
            // }else{
            // left = mid+1;
            // }
            
            //or
             if (sumByD(nums, mid) <= threshold) {
                right= mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
        
    }
}
