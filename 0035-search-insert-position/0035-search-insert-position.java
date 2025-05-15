class Solution {
    public int searchInsert(int[] nums, int target) {
        int li=0; int ri=nums.length-1;
        while(li<=ri){
            int mid=(li+ri)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                ri=mid-1;;
            }
            else{
                li=mid+1;
            }
        }
        return li;
    }
}