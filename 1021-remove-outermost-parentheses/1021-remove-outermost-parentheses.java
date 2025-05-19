class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder sb = new StringBuilder();
        int operand=0;
        for(char ch: s.toCharArray()){
            if(ch=='(' && operand++>0) sb.append(ch);
            if(ch==')' && operand-->1) sb.append(ch);
        }
        return sb.toString();
    }
}