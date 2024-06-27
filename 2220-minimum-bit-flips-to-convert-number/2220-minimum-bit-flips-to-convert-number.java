class Solution {
    public int minBitFlips(int start, int goal) {
        int count = 0;
        int diff = start ^ goal;
        
        while (diff != 0) {
            count += diff & 1;
            diff >>= 1;
        }
        
        return count;
    }
}
