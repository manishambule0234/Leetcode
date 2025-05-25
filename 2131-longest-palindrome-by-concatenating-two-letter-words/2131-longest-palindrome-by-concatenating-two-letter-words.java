class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> HM=new HashMap<>();
        for(int i=0;i<words.length;i++){
            HM.put(words[i], HM.getOrDefault(words[i], 0) + 1);
        }
        int count=0;
        boolean hasCenter = false;
        for(int i=0;i<words.length;i++){
            String str=new StringBuilder(words[i]).reverse().toString();

            if(words[i].equals(str)){
                if (HM.get(words[i]) >= 2) {
                    count += 4;
                    HM.put(words[i], HM.get(words[i]) - 2);
                } else if (!hasCenter && HM.get(words[i]) == 1) {
                    count += 2;
                    HM.put(words[i], HM.get(words[i]) - 1);
                    hasCenter = true;
                }
            }


            else if(HM.containsKey(words[i])&&HM.containsKey(str)&&
                    HM.get(words[i]) > 0 && HM.get(str)>0){
                int freqwords=HM.get(words[i]);
                int freqstr=HM.get(str);
                count+=4;
                HM.put(words[i],freqwords-1);
                HM.put(str,freqstr-1);
            }
        }
        return count;
    }
}