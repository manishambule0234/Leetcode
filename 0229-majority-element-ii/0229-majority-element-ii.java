class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int k=nums.length/3;
        List<Integer> al=new ArrayList<>();
        Arrays.sort(nums);
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            
        else{
            if(count>k)
            al.add(nums[i-1]);
            count=1;
            }
        }
        if(count>k)
            al.add(nums[nums.length-1]);
        return al;
    }
}