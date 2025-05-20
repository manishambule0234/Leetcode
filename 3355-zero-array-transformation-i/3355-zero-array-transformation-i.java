// class Solution {
//     public static void transform(int[] arr,int li,int ri){
//         for(int i=li;i<=ri;i++){
//             if(arr[i]!=0)
//             arr[i]=arr[i]-1;
//         }
//     }
//     public boolean isZeroArray(int[] nums, int[][] queries) {
//         for(int i=0;i<queries.length;i++){
//             transform(nums,queries[i][0],queries[i][1]);
//         }
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=0){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

class Solution {
    //Difference Array technique
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
       int [] diff =new int[n];
       // Step 1: Make difference array using queries
       for(int[] query : queries){
        int start=query[0];
        int end=query[1];
        diff[start]+=1;
        if(end+1<n){
            diff[end+1]-=1;
        }
       }

       //step 2 cumulative sum of diff in an array
       int [] result =new int[n];
       int Cumsum=0;
       for(int i=0;i<n;i++){
        Cumsum+= diff[i];
        result[i]=Cumsum;
       }

       //step3 : check if each value can reach 0
       for(int i=0;i<n;i++){
        if(nums[i]>result[i])
        return false;
       }
       return true;
    }
}