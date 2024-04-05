class Solution {
      public static int findMax(int piles[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<piles.length;i++){
            max = Math.max(max , piles[i]);
        }
        return max;
    }
   public static int calculateTotalHour(int[] piles, int hourly) {
        int sum = 0;
        int n = piles.length;
        // Find total sum 
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double)(piles[i]) / (double)(hourly));
        }
        return sum;
    }

    

    public int minEatingSpeed(int[] piles, int h) {
//        int max = findMax(piles);
//       for(int i=0;i<=max;i++){
//         int  calculateSum = findCompleteHourly(piles,i);
//          if(calculateSum<=h){
//              return i;
//          }
//       }
//       return -1;
//     }
// }
        
        //or binary search
           int low = 1, high = findMax(piles);
           
        // Apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            int sum = calculateTotalHour(piles, mid); 
            if (sum <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
        //o(nlogm)time and o(1) space
        
//           int low = 1, high = Integer.MIN_VALUE;
//         int n = piles.length;
        
//         // Find the maximum number of bananas
//         for (int i = 0; i < n; i++) {//o(N)
//             high = Math.max(high, piles[i]);
//         }

//         // Apply binary searcho(logm)
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             int sum = 0;
            
//             // Calculate total hours
//             for (int i = 0; i < n; i++) {
//                 sum += Math.ceil((double) piles[i] / (double) mid);
//             }
            
//             // Adjust the search boundaries
//             if (sum <= h) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
        
//         return low;
        
//     }
// }