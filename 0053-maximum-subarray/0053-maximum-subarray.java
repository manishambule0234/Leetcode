class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        
        return maxSum;
    }
}

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int currSum = 0;
//         int maxSum = nums[0];
//         for(int n : nums){
//             currSum+= n;
//             maxSum = maxSum<currSum? currSum : maxSum;
//             currSum = currSum<0? 0 : currSum; 
//         }
//         return maxSum;
// }
// }