class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0 ,j=0,k=0;
        int m[] = new int[nums1.length+nums2.length];
        while(i<nums1.length&&j<nums2.length){
         if(nums1[i]<nums2[j]){
             m[k] = nums1[i];
             i++;
             k++;
             
         }else{
             m[k]= nums2[j];
             j++;
             k++;
         }
        }
        
        //rest of elements
        while(i<nums1.length){
            m[k] = nums1[i];
            i++;
            k++;
            
        }
        while(j<nums2.length){
            m[k]=nums2[j];
            j++;
            k++;
        }
        //find median 
        if(m.length%2==0){
          int mid = m.length/2;
            return (double)((m[mid]+m[mid-1])/2.0);
        }else{
           int mid = m.length/2;
            return m[mid];
        }
     
    }
}