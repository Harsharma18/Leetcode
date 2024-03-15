import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        //Time Complexity: O(n) Space Complexity: O(1)
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int count =0;
        for(int i=0;i<n;i++){
            if(nums[count]!=nums[i]){
              count++;
                nums[count]=nums[i];
                
            }
           
            
        }
        return count+1;
        
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        Solution s = new Solution();
        int count = s.removeDuplicates(nums);
        
       for (int i = 0; i < count; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}