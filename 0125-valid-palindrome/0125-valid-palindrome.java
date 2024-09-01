class Solution {
    public boolean isPalindrome(String s) {
        int p1 = 0;
        int p2 = s.length() - 1;
        s = s.toLowerCase();
        
        while (p1 < p2) {
            char ch1 = s.charAt(p1);
            char ch2 = s.charAt(p2);
            
            // Skip non-alphanumeric characters for p1
            if (!((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= '0' && ch1 <= '9'))) {
                p1++;
                continue;
            }
            
            // Skip non-alphanumeric characters for p2
            if (!((ch2 >= 'a' && ch2 <= 'z') || (ch2 >= '0' && ch2 <= '9'))) {
                p2--;
                continue;
            }
            
            // Compare the characters
            if (ch1 != ch2) {
                return false;
            }
            
            p1++;
            p2--;
        }
        
        return true;
    }
}
