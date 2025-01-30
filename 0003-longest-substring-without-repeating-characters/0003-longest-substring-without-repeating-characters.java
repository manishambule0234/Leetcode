class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count=0;
       
        int k=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            
            int flag=1;
            for(int j=i-1;j>=k;j--){
                if(s.charAt(i)!=s.charAt(j)){
                    flag=1;
                }
                else {
                    flag=0;
                    break;
                }
            }
            if(flag==1){
            count++;
            ans = Math.max(ans, count);
            }
            else{
                
                count=0;
                k++;
                i=k-1;
            }
        }
        return ans;
    }
}