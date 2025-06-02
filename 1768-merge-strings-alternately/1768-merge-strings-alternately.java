class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str="";
        int n=Math.min(word1.length(),word2.length());
        for(int i=0;i<n;i++){
            str= str + word1.charAt(i);
            str= str + word2.charAt(i);
        }
        if(word1.length()>word2.length()){
            str=str.concat(word1.substring(word2.length()));
        }
        else{
            str=str.concat(word2.substring(word1.length()));
        }
        return str;
    }
}