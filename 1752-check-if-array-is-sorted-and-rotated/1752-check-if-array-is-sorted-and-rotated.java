import java.util.Scanner;

public class Solution {
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        
        // Find the index of the smallest element
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }
        
        // Check if the array is sorted in ascending order after rotation
        for (int i = 0; i < n; i++) {
            int index = (i + minIndex) % n;
            int nextIndex = (index + 1) % n;
            if (nums[index] > nums[nextIndex]) {
                count++;
            }
            if(count>1){
                return false;
            }
        }

    
    return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        boolean result = solution.check(nums);
        System.out.println("Output: " + result);
    }
}
