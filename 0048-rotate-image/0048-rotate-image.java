class Solution {
    public static void transpose(int [][] matrix){
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public static void reverse(int [][] matrix){
        int n=matrix.length;
        for(int i=0;i<n;i++){
        int li=0;
        int ri=matrix[0].length-1;
        while(li<=ri){
            int temp=matrix[i][li];
            matrix[i][li]=matrix[i][ri];
            matrix[i][ri]=temp;
            li++;
            ri--;
        }
        }
    } 
    public void rotate(int[][] matrix) {
       transpose(matrix);
       reverse(matrix);
    }
}