class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                count++;
                nums[count]=nums[i+1];
            }
        }
        return count+1;
    }
}

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         if (nums.length == 0) return 0;
        
//         int uniqueIndex = 1;
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] != nums[i - 1]) {
//                 nums[uniqueIndex] = nums[i];
//                 uniqueIndex++;
//             }
//         }
//         return uniqueIndex;
//     }
// }