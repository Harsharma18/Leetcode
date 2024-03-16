import java.util.*;

class Solution {

    public static void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(k<0){
            k=k+nums.length;
        }
         reverse(nums,0,nums.length-1);
        reverse(nums,k,nums.length-1);
         reverse(nums,0,k-1);
        
       
        
       
        
        
       
    }

    public static void reverse(int nums[],int start,int end) {
         while(start<=end){
             int temp= nums[start];
              nums[start]=nums[end];
              nums[end] = temp;
             start++;
             end--;
             
             
         }
       
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(nums, k);
        for(int i=0;i<n;i++){
            System.out.println(nums[i]);
        }
    }
}
