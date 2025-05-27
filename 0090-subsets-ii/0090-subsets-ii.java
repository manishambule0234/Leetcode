class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        subset(res,temp,nums,0);
        return res;
    }
    public static void subset(List<List<Integer>> res,List<Integer> temp,int[] nums,int idx){
        
            res.add(new ArrayList<>(temp));
          
        for(int i=idx;i<nums.length;i++){
            if(i>idx&&nums[i]==nums[i-1])
            continue;

            temp.add(nums[i]);
            subset(res,temp,nums,i+1);

            temp.remove(temp.size()-1);
            // subset(res,temp,nums,i+1);
        }

    }
}