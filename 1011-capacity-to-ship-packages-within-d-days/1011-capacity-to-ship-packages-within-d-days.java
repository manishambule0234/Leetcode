class Solution {
    public static boolean check(int[]arr,int cap,int days){
            int currentLoad=0;
            int requireDays=1;
            for(int ele:arr){
                if(ele+currentLoad>cap){
                    requireDays++;
                    currentLoad=0;
                }
                currentLoad+=ele;
            }
        return requireDays<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int li=0;
        int ri=0;
        for(int ele:weights){
            li=Math.max(li,ele);
            ri+=ele;
        }
        while(li<=ri){
        int mid=(li+ri)/2;
        
        if(check(weights,mid,days)){
            ri=mid-1;
        }
        else{
            li=mid+1;
        }}
        return li;
    }
}