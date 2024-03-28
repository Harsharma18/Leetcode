class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //o(m+n) time and space complexity
//         int nums3[] = new int [n+m];
//         int left =0;
//         int right=0;
//         int index = 0;
//         while(left<m  && right<n){
//           if(nums1[left]<=nums2[right]){
//               nums3[index] = nums1[left];
//             left++;
//             index++;
//         }else{
//               nums3[index] = nums2[right];
//               right++;
//               index++;
//           }
//         }
//         while(left<m){
//             nums3[index] = nums1[left];
//             index++;
//             left++;
//         }
//         while(right<n){
//             nums3[index] = nums2[right];
//             index++;
//             right++;
//         }
//         for(int i=0;i<m+n;i++){
//             if(i<m+n){
//                 nums1[i] = nums3[i];
//             }else{
//                 nums2[i-m] = nums3[i];
//             }
//         }
     
//     }
// }
        
      //  O(min(n, m)) + O(n*logn) + O(m*logm), and o(1)space 
//       int left = n - 1;
//         int right = 0;

//         // Swap the elements until arr1[left] is
//         // smaller than arr2[right]:
//         while (left >= 0 && right < m) {
//             if (nums1[left] > nums2[right]) {
//                 int  temp = nums1[left];
//                 nums1[left] = nums2[right];
//                 nums2[right] = temp;
//                 left--;
//                 right++;
//             } else {
//                 break;
//             }
//         }

//         // Sort arr1[] and arr2[] individually:
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//     }
// }
       
        //O((n+m)*log(n+m)).time and o(1) soace using gap method

//          int len = m+n;
//         int gap = (len/2)+(len%2);
       
//         while(gap>0){
//              int left =0;
//         int right = left+gap;
//        while(right<len){
//            if(left<m && right>=m){
//                swap(nums1,nums2,left,right-m);
//            }else if(left>=m){
//                swap(nums2,nums2,left-m,right-m);
//            }else{
//                swap(nums1,nums1,left,right);
//            }
//            left++;
//            right++;
    
// }       
            
        
//          if(gap==1){
//                 break;
//          }
//               gap = (gap/2)+(gap%2);
      
//         }
//     }
//         public static void swap(int nums1[],int nums2[],int left,int right){
//             if(nums1[left]>nums2[right]){
//                 int temp = nums1[left];
//                 nums1[left] = nums2[right];
//                 nums2[right] = temp;
//             }
//         }
// }
      int l = m-1;
        int r = n-1;
        int k = m+n-1;
        while(r>=0){
            if(l>=0 && nums1[l]>nums2[r]){
                nums1[k] = nums1[l];
                k--;
                l--;
            }else{
                nums1[k] = nums2[r];
                k--;
                r--;
            }
        }
    }
}