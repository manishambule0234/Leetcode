class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        float arr[]=new float[n+m];
        int median=0;
        int i=0;int j=0;
        int k=0;
        while(i<n&&j<m){
            if(nums1[i]<nums2[j]){
                arr[k++]=nums1[i++];
            }
            else{
                arr[k++]=nums2[j++];
            }
        }
        while(i<n){
            arr[k++]=nums1[i++];
        }
        while(j<m){
            arr[k++]=nums2[j++];
        }
        float temp=0;
        if(arr.length%2!=0){
            temp=arr[arr.length/2];
        }
        else{
            temp=(arr[(arr.length/2)]+arr[((arr.length/2)-1)])/2;
        }
        return temp;
    }
}