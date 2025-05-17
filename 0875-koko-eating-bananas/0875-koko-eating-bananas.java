class Solution {
    public static int hours(int[] arr,int h){
        int count=0;
        for(int ele:arr){
            count+=Math.ceil((double)ele/(double)h);
        }
        return count;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int li=0;
        int ri=0;
        for(int ele:piles){
            ri=Math.max(ri,ele);
        }
        while(li<=ri){
            int mid=(li+ri)/2;
            int totalhours=hours(piles,mid);
            if(totalhours<=h)
            ri=mid-1;
            else
            li=mid+1;
        }
        return li;
    }
}