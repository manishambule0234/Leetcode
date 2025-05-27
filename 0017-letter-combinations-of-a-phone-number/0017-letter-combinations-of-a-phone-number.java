class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<String>();
       PrintAllLeters(digits,"",list);
       return list;
    }
    public static String[] letters={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void PrintAllLeters(String digits,String ans,List<String> list){
        if(digits.length()==0){
            if(ans.isEmpty()){
                return;
            }
            list.add(ans);
            return;
        }
        char ch=digits.charAt(0);
        int val=(int)ch-(int)'0';
        for(int i=0;i<letters[val].length();i++){
            PrintAllLeters(digits.substring(1),ans+letters[val].charAt(i),list);
        }
    }
}