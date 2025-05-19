class Solution {
    public static boolean checkpalindrome(String str){
        int li=0;
        int ri=str.length()-1;
        while(li<=ri){
            if(str.charAt(li)!=str.charAt(ri))
            return false;
            li++;
            ri--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        int num=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub= s.substring(i,j+1);
                
                if(checkpalindrome(sub)){
                    count=sub.length();
                    if(count>num){
                        sb.setLength(0);
                        sb.append(sub);
                    }
                    num=count;
                }
            }
        }
        return sb.toString();
    }
}