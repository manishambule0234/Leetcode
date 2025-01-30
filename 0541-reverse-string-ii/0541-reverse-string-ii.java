class Solution {
    public String reverseStr(String s, int k) {
          StringBuilder sb = new StringBuilder(s);
    int n = s.length();
    
    for (int i = 0; i < n; i += 2 * k) {
        int j = Math.min(i + k - 1, n - 1);
        for (int left = i, right = j; left < right; left++, right--) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
        }
    }
    
    return sb.toString();
    }
}