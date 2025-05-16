class Solution {
    public static int HammingDistance(String s1,String s2){
        int count=0;
        for(int i=0;i<s1.length();i++){
        if(s1.charAt(i)!=s2.charAt(i)){
            count++;
        }
        }
        return count;
    }
    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
        int n=groups.length;
        int maxLen=0;
        int maxEnd=-1;
        int[] dp=new int[n];
        int[] prev=new int[n];
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            prev[i]=-1;
            for(int j=0;j<i;j++){
                if(groups[i]!=groups[j]&&words[i].length()==words[j].length()&&HammingDistance(words[i],words[j])==1){
                    if(dp[i]<dp[j]+1){
                        dp[i]=dp[j]+1;
                        prev[i]=j;
                    }
                }
            }
            if(maxLen<dp[i]){
                maxLen=dp[i];
                maxEnd=i;
            }
        }
        List<String> result=new ArrayList<>(); 
        do{
            result.add(words[maxEnd]);
            maxEnd=prev[maxEnd];
        }
        while(maxEnd!=-1);
        Collections.reverse(result);
        return result;

        }
    }
