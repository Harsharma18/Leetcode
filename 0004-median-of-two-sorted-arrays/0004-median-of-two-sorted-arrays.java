class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //time o(m+n) and space o(n)
//         int i=0 ,j=0,k=0;
//         int m[] = new int[nums1.length+nums2.length];
//         while(i<nums1.length&&j<nums2.length){
//          if(nums1[i]<nums2[j]){
//              m[k] = nums1[i];
//              i++;
//              k++;
             
//          }else{
//              m[k]= nums2[j];
//              j++;
//              k++;
//          }
//         }
        
//         //rest of elements
//         while(i<nums1.length){
//             m[k] = nums1[i];
//             i++;
//             k++;
            
//         }
//         while(j<nums2.length){
//             m[k]=nums2[j];
//             j++;
//             k++;
//         }
//         //find median 
//         if(m.length%2==0){
//           int mid = m.length/2;
//             return (double)((m[mid]+m[mid-1])/2.0);
//         }else{
//            int mid = m.length/2;
//             return m[mid];
//         }
     
//     }
// }
//time o(m+n)/2 
//   int i=0 ,j=0,k=0;
//         int m[] = new int[nums1.length+nums2.length];
//         while(i<nums1.length&&j<nums2.length && k<=m.length){
//          if(nums1[i]<nums2[j]){
//              m[k] = nums1[i];
//              i++;
//              k++;
             
//          }else{
//              m[k]= nums2[j];
//              j++;
//              k++;
//          }
//         }
        
//         //rest of elements
//         while(i<nums1.length && k<=m.length){
//             m[k] = nums1[i];
//             i++;
//             k++;
            
//         }
//         while(j<nums2.length&&k<=m.length){
//             m[k]=nums2[j];
//             j++;
//             k++;
//         }
//         //find median 
//         if(m.length%2==0){
//           int mid = m.length/2;
//             return (double)((m[mid]+m[mid-1])/2.0);
//         }else{
//            int mid = m.length/2;
//             return m[mid];
//         }
     
//     }
// }
        
     //O(min(logn, logm))time and space o(1)
        
if(nums2.length<nums1.length){
  return  findMedianSortedArrays(nums2,nums1);
}
int left =0;
int right = nums1.length;
while(left<=right){
    int m1= (left+right)/2;
    int m2 = (nums1.length+nums2.length+1)/2-m1;
    int l1 = (m1==0) ? Integer.MIN_VALUE:nums1[m1-1];
    int r1 =( m1==nums1.length) ? Integer.MAX_VALUE:nums1[m1];
    int l2 = (m2==0)?Integer.MIN_VALUE:nums2[m2-1];
    int r2 =( m2==nums2.length) ? Integer.MAX_VALUE:nums2[m2];
    
    if(l1<=r2 && l2<=r1){
        //find median 
        if((nums1.length+nums2.length)%2==0){//even
            return  ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
        }else{
           return (double) Math.max(l1,l2);
        }
    }

 else if(l2>r1){
     left = m1+1;
 }else{
     right = m1-1;
 }
}

return 0.0;

    }
}




  