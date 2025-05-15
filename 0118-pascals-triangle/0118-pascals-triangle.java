class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> parent = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> child = new ArrayList<Integer>();
            for(int j=0;j<i+1;j++){
                if(j==0||j==i){
                    child.add(1);
                }
                else
                child.add(parent.get(i-1).get(j-1)+parent.get(i-1).get(j));
            }
            parent.add(child);
        }
        return parent;
    }
}