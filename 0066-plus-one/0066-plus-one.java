class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse the array from the last digit to the first
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, just increment it and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // Set the current digit to 0 and continue to the next digit
            digits[i] = 0;
        }
        
        // If all digits were 9, we need a new array
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // Set the first digit to 1
        return newNumber; // The rest are already initialized to 0
    }
}
