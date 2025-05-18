class Solution {
    public static int maxincol(int[][] mat,int col,int n,int m){
        int low=0;
        int idx=-1;
        for(int i=0;i<n;i++){
            if(mat[i][col]>low){
                low=mat[i][col];
                idx=i;
            }
        }
        return idx;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int li=0;
        int ri=m-1;
        while(li<=ri){
            int mid=(li+ri)/2;
            int row=maxincol(mat,mid,n,m);
            int left=(mid-1>=0)?mat[row][mid-1]:-1;
            int right=(mid+1<=m-1)?mat[row][mid+1]:-1;

            if(mat[row][mid]>left&&mat[row][mid]>right){
                return new int []{row,mid};
            }
            else if(mat[row][mid]<right){
                li=mid+1;
            }
            else{
                ri=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}