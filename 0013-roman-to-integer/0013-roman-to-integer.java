public class Solution {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0)
            return 0;
        
        // Map to store the integer values for each Roman numeral
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        int result = romanMap.get(s.charAt(0)); // Initialize result with the value of the first numeral
        
        // Iterate through the string and add/subtract values based on the next numeral
        for (int i = 1; i < s.length(); i++) {
            int currentValue = romanMap.get(s.charAt(i));
            int previousValue = romanMap.get(s.charAt(i - 1));
            
            if (currentValue <= previousValue) {
                // If the current numeral is less than or equal to the previous one, add its value
                result += currentValue;
            } else {
                // If the current numeral is greater than the previous one, subtract twice the value of the previous numeral
                // to account for the addition made in the previous iteration
                result += currentValue - 2 * previousValue;
            }
        }
        
        return result;
    }
}
