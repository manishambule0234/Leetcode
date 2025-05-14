class Solution {
    public int maxSubArray(int[] nums) {
        int count=(int)((-1*(Math.pow(10,4)))-1);
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                count=Math.max(sum,count);
            }
        }
        return count;
    }
}