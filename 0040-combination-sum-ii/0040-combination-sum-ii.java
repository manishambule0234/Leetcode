class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(candidates);
        combination(res,temp,candidates,0,target);
        return res;
    }

    public static void combination(List<List<Integer>> res,List<Integer> temp,int[] candidates,int idx,int target){
        if(target<0)
        return;
       
        if(target==0){
            res.add(new ArrayList<Integer>(temp));
            return;
        }
       
        for(int i=idx;i<candidates.length;i++){
            if(i>idx&& candidates[i]==candidates[i-1])
            continue;

            if(candidates[i]>target)
            break;

            temp.add(candidates[i]);
            combination(res,temp,candidates,i+1,target-candidates[i]);
            temp.remove(temp.size()-1);
        }
        }
    
}