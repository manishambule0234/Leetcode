class Solution {
    public boolean search(int[] nums, int target) {
        int li=0;int ri =nums.length-1;
        while(li<=ri){
            int mid=(li+ri)/2;
            if(nums[mid]==target){
                return true;
            }
             if (nums[mid] == nums[li]) {
                li++;
                continue;
            }
            else if(nums[mid]>=nums[li]){
                if(target>=nums[li]&&target<=nums[mid]){
                    ri=mid-1;
                }
                else
                li=mid+1;
            }
            else{
                if(target>=nums[mid]&&target<=nums[ri]){
                    li=mid+1;
                }
                else{
                    ri=mid-1;
                }
            }
        }
        return false;
    }
}