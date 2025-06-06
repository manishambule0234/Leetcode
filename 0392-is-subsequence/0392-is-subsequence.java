class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
        return true;
        int n=0;

        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(n)){
                n++;
                if(n==s.length())
                break;
            }
        }
        return (n==s.length())?true:false;
    }
}