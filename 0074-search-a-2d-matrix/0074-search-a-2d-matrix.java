/*every row start with a plane index multiple of m so for getting the row no divide by m
every col ha elements from the no. divide by m to next no. divide by m that it has their remainder stored in their index hence modulo by m*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int li=0;
        int ri=n*m-1;
        while(li<=ri){
            int mid=(li+ri)/2;
            int row=mid/m;//formula for converting plane index to row no.
            int col=mid%m;//formula for converting plane index to col no.
            int num=matrix[row][col];
            if(num==target){
                return true;
            }
            else if(num<target){
                li=mid+1;
            }
            else{
                ri=mid-1;
            }
        }
        return false;
    }
}