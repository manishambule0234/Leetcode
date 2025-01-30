class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count=0;
        int flag=0;
        for(int i=0;i<s.length();i++){
            for(int j=i-1;j>=0;j--){
                if(s.charAt(i)!=s.charAt(j)){
                    flag=1;
                }
                else {
                    flag=0;
                }
            }
            if(flag==1)
            count++;
            else{
                count=0;
            }
        }
        return count;
    }
}