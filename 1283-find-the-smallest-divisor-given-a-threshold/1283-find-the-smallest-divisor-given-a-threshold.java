class Solution {
        public static int sum(int[] arr,int h){
        int count=0;
        for(int ele:arr){
            count+=Math.ceil((double)ele/(double)h);
        }
        return count;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int li=0;
        int ri=0;
        for(int ele:nums){
            ri=Math.max(ri,ele);
        }
        while(li<=ri){
            int mid=(li+ri)/2;
            int total=sum(nums,mid);
            if(total<=threshold)
            ri=mid-1;
            else
            li=mid+1;
        }
        return li;
    }
}