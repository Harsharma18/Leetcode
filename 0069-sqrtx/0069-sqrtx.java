class Solution {
    public int mySqrt(int x) {
        //o(n)time and o(1)space
//         int ans = 0;
//         for (int i = 0; i <= x; i++) {
//             long val = (long) i * i; // Using long to avoid overflow
//             if (val <= x) {
//                 ans = i;
//             } else {
//                 break;
//             }
//         }
//         return ans;
//     }
// }
        
        //o(logn)time and o(1)space 
          //o(logn) time and o(1) space 
//         int left = 1;
//         int right = x;
//         int ans = 0;
//         while (left <= right) {
//             int mid = (left + right) / 2;
//             long val = (long) mid * mid;
//             if (val <= x) {
//                 ans = mid;
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }
//         return ans;
//     }
// }
          if (x == 0 || x == 1) {
            return x;
        }

        int left = 1;
        int right = x;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long val = (long) mid * mid;

            if (val == x) {
                return mid; // If square of mid equals x, mid is the square root
            } else if (val < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}