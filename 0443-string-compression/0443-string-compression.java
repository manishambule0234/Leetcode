class Solution {
    public int compress(char[] chars) {
        int count = 1;
        int index = 0;
        
        for (int i = 1; i <= chars.length; i++) {
            if (i < chars.length && chars[i] == chars[i - 1]) {
                count++;
            } else {
                chars[index++] = chars[i - 1];  // Write the character
                
                if (count > 1) {
                    String countStr = Integer.toString(count);
                    for (char c : countStr.toCharArray()) {
                        chars[index++] = c;  // Write each digit
                    }
                }
                count = 1;
            }
        }
        
        return index;
    }
}
