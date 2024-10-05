class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();  // To store the reversed words
        int i = s.length() - 1;  // Start from the end of the string

        // Step 1: Process the string from the end
        while (i >= 0) {
            // Skip any trailing spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            
            // If i is less than 0, we have processed the whole string
            if (i < 0) {
                break;
            }
            
            // Step 2: Find the end of the current word
            int wordEnd = i;
            
            // Move backward to find where the word starts
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            
            // Step 3: Add the word to the result
            if (result.length() > 0) {
                result.append(" ");  // Add space between words
            }
            result.append(s.substring(i + 1, wordEnd + 1));  // Add the word (from i+1 to wordEnd)
        }
        
        return result.toString();  // Return the final reversed sentence
    }
}
