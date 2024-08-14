import java.util.*;

class Solution {
    // Array representing the letters for each digit on a phone keypad
    private static final String[] KEYPAD = {
        "",    // 0
        "",    // 1
        "abc", // 2
        "def", // 3
        "ghi", // 4
        "jkl", // 5
        "mno", // 6
        "pqrs",// 7
        "tuv", // 8
        "wxyz" // 9
    };
    
    // Function to combine letters from the current digit with existing combinations
    private void combine(List<String> result, String letters) {
        List<String> newResult = new ArrayList<>();
        
        // Loop through each existing combination
        for (int i = 0; i < result.size(); i++) {
            String combination = result.get(i);
            
            // Loop through each letter corresponding to the current digit
            for (int j = 0; j < letters.length(); j++) {
                // Create a new combination and add it to the new result list
                newResult.add(combination + letters.charAt(j));
            }
        }
        
        // Update the original result list with the new combinations
        result.clear();
        result.addAll(newResult);
    }

    // Function to get letter combinations based on the input digits
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        // Edge case: if digits is empty, return an empty list
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        
        // Start with an empty combination
        result.add("");
        
        // Loop over each digit in the input string
        for (int i = 0; i < digits.length(); i++) {
            int digit = digits.charAt(i) - '0';  // Convert the character to an integer
            String letters = KEYPAD[digit];      // Get the corresponding letters for the digit
            
            // Combine the current set of letters with existing combinations
            combine(result, letters);
        }
        
        return result;
    }

    
}
