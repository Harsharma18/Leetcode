class Solution {
    public int findKthPositive(int[] arr, int k) {//o(N)time and o(1)space 
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]<=k){
//                 k++;
//             }
//         }
//         return k;
//     }
// }
        
        //binary search 
        int left =0;
        int right = arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            int missing = arr[mid]-(mid+1);
            if(missing<k){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return right+1+k;
    }
}
       