class Solution {
    public String reverseWords(String s) {
        StringBuilder  sb = new StringBuilder();
        int i = s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i) ==' '){
                i--;
            }
            int wordStart = i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            if(wordStart>=0){
                if(sb.length()>0){
                    sb.append(" ");
                }
               
                    sb.append(s.substring(i+1,wordStart+1));
                
            }
        }
        return sb.toString();
    }
}
//class Solution {
//     public String reverseWords(String s) {
//         int i = s.length() - 1;
//         String result = "";

//         // Skip  spaces
//         while (i >= 0 && s.charAt(i) == ' ') {
//             i--;
//         }
        
//         int wordEnd = i;
        
//         while (i >= 0) {
//             // Skip leading spaces for the current word
//             while (i >= 0 && s.charAt(i) == ' ') {
//                 i--;
//             }
//             int wordStart = i;

//             // Find the start of the current word
//             while (i >= 0 && s.charAt(i) != ' ') {
//                 i--;
//             }

//             // Add the current word to the result
//             if (wordStart >= 0) {
//                 if (!result.isEmpty()) {
//                     result += " "; // Add a space before the next word
//                 }
//                 result += s.substring(i + 1, wordStart + 1);
//             }
//         }
        
//         return result;
//     }
// }
