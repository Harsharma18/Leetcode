import java.util.*;

class Solution {
    public String frequencySort(String s) {
        // Create a map to store character frequencies
        Map<Character, Integer> charFrequency = new HashMap<>();
        
        // Count frequencies of characters
        for (char c : s.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        
        // Create a list of map entries and sort it by frequency
        List<Map.Entry<Character, Integer>> entries = new ArrayList<>(charFrequency.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue()); // Sort by frequency
        
        // Build the sorted string
        StringBuilder sortedString = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entries) {
            char c = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                sortedString.append(c);
            }
        }
        
        return sortedString.toString();
    }
}
