public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder(); // To build the result string
        int carry = 0; // To keep track of carry
        int i = a.length() - 1; // Pointer for string a
        int j = b.length() - 1; // Pointer for string b

        // Traverse both strings from the end to the beginning
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry; // Start with the carry value

            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char to int
                i--;
            }
            
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert char to int
                j--;
            }
            
            // Update carry for next iteration
            carry = sum / 2;
            
            // Append the current bit to the result
            result.append(sum % 2);
        }

        // Reverse the result string to get the final answer
        return result.reverse().toString();
    }
}
