class Solution {
    public int firstMissingPositive(int[] nums) {
        int j=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==j&&i!=nums.length-1){
                j++;
                i=-1;
            }
            else if (i==nums.length-1){
                if(nums[i]!=j){
                break;
            }
            else{
                j++;
                i=-1;
            }
            }
        }
        return j;
    }
}