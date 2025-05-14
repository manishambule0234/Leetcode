class Solution {
    public boolean check(int[] nums) {
        int[] sortedArr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedArr);
        if(Arrays.equals(nums, sortedArr)){
            return true;
        }
        int flag=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                flag++;
            }
        }
        if(flag==1&&nums[nums.length-1]<=nums[0]){
            flag=0;
        }
        if(flag==0){
            return true;
        }
        else
        return false;
    }
}