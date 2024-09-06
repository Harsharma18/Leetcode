class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += num1.charAt(i) - '0'; // Convert char to int
                i--;
            }
            if (j >= 0) {
                sum += num2.charAt(j) - '0'; // Convert char to int
                j--;
            }
            result.append(sum % 10); // Get the last digit
            carry = sum / 10; // Calculate carry
        }

        return result.reverse().toString(); // Reverse the result
    }
}
