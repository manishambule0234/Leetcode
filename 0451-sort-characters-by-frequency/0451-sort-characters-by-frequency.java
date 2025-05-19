class Solution {
    public String frequencySort(String s) {
        int [] arr=new int[123]; //Ascii range
       
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        
        List<Character> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                al.add((char) i);
            }
        }

        al.sort((a,b) -> arr[b]-arr[a]);

            StringBuilder sb=new StringBuilder();
            for(char ch:al){
                for(int i=0;i<arr[ch];i++){
                    sb.append(ch);
                }
            }
            return sb.toString();
    }
}