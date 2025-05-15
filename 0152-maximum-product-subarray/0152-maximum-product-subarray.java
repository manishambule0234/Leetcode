class Solution {
    public int maxProduct(int[] nums) {
        int count=-11;
        for(int i=0;i<nums.length;i++){
            int sum=1;
            for(int j=i;j<nums.length;j++){
                System.out.println(count);
                sum=sum*nums[j];
                count=Math.max(sum,count);
                System.out.println(count);
            }
        }
        return count;
    }
}