class Solution {
    public String reverseWords(String s) {

 s = s.trim();
        
        // Split the string by one or more spaces
        String[] words = s.split("\\s+");
        
        // Create a StringBuilder to hold the result
        StringBuilder sb = new StringBuilder();
        
        // Iterate over the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) //i is a number that will tell when the last word will come.
             {
                sb.append(" ");
            }
        }
        
        // Convert StringBuilder to String and return
        return sb.toString();

    }
}