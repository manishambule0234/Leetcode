class Solution {
    public List<Integer> lexicalOrder(int n) {
        
List<Integer> list =new ArrayList<Integer>();
for(int i=1;i<=9;i++){
printLexicalNumbers(n,i,list);
}
return list;
    }
    public static void printLexicalNumbers(int n,int curr,List<Integer> list){
if(curr>n){
return;
}
list.add(curr);
for(int i=0;i<=9;i++){
printLexicalNumbers(n,curr*10+i,list);
}
    }}