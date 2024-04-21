class Solution {
    // Method to check if s can be rotated to form goal
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false; // If lengths are different, s cannot be rotated to form goal
        }
        
        String doubleS = s + s; // Concatenate s with itself
        return doubleS.contains(goal); // Check if goal is a substring of the concatenated string
    }
}