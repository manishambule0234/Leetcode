class Solution {
    public static void updatearr(int[]bloomDay,int[]arr,int mid){
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid)
            arr[i]=1;
        }
    }
    public static boolean checkvalid(int[] arr,int k, int m){
        int c=k;
                int  b=0;
                for(int ele:arr){
                    if(ele==1){
                        c--;
                    }
                    else
                    c=k;
                    if(c==0) {
                        b++;
                        c=k;
                    }
                    if(b==m)
                    return true;
                }
                return false;
    }


    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(long)m*k)
        return -1;

        int li=Integer.MAX_VALUE;
        int ri=0;
        for(int ele: bloomDay){
           ri= Math.max(ele,ri);
           li=Math.min(ele,li);
        }
        int flag=0;
        int ans=Integer.MAX_VALUE;  
    while(li<=ri){
            int mid=(li+ri)/2;
           int[] arr = new int[bloomDay.length]; // reset arr
            updatearr(bloomDay, arr, mid);

           boolean t= checkvalid(arr,k,m);
               if(t){
                ans=Math.min(ans,mid);
                ri=mid-1;
                 flag=1;
               }
               else
               li=mid+1;
            
        }
        if(flag==1) return ans;
        else return -1;
}}