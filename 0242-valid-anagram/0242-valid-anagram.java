class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        else{
        StringBuilder str = new StringBuilder(t);
        int flag=0;
        for(int i=0;i<s.length();i++){
            flag=0;
            for(int j=0;j<str.length();j++){
                if(s.charAt(i)==str.charAt(j)){
                    str.setCharAt(j,'0');
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                break;
            }
        }
        return true ? flag==1 : false;
        }
    }
}