class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Take the first string as a reference
        String prefix = strs[0];
        
        // Loop through the characters of the first string
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            
            // Compare the character with the corresponding character in other strings
            for (int j = 1; j < strs.length; j++) {
                // If the character doesn't match or we've reached the end of any string, return the prefix found so far
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return prefix.substring(0, i);
                }
            }
        }
        
        // Return the entire first string if all characters match in all strings
        return prefix;
    }
}
