class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            if(matrix[i][0]<=target&&matrix[i][m-1]>=target){
                if(binary(matrix[i], target))
                return true;
            }
    }
    return false;
    }
    public static boolean binary(int[] arr,int tar){
        int li=0;
        int ri=arr.length;
        while(li<=ri){
            int mid=(li+ri)/2;
            if(arr[mid]==tar)
            return true;

            else if(tar>arr[mid]){
            li=mid+1;}

            else{
                ri=mid-1;
            }
        }
        return false;

    }
}