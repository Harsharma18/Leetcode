public class Solution {
    public static boolean isAnagram(String str1, String str2) {
        // Check if the lengths of the strings are different, if so, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create an array to store the frequency of each character in str1
        int[] charCount = new int[26]; // Assuming we are dealing with lowercase English letters

        // Increment the count of each character in str1
        for (char c : str1.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Decrement the count of each character in str2
        for (char c : str2.toCharArray()) {
            charCount[c - 'a']--;
        }

        // If the strings are anagrams, charCount should contain all zeros
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        // If all characters have the same frequency in both strings, they are anagrams
        return true;
    }
}
