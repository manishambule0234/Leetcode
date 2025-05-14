class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> List = new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int min_row=0;
        int max_row=n-1;
        int min_col=0;
        int max_col=m-1;
        int count=0;
        int total=n*m;
        while(count<total){
            for(int i=min_col;i<=max_col&&count<total;i++){
                List.add(matrix[min_row][i]);
                count++;
            }
            min_row++;

            for(int i=min_row;i<=max_row&&count<total;i++){
                List.add(matrix[i][max_col]);
                count++;
            }
            max_col--;

            for(int i=max_col;i>=min_col&&count<total;i--){
                List.add(matrix[max_row][i]);
                count++;
            }
            max_row--;

            for(int i=max_row;i>=min_row&&count<total;i--){
                List.add(matrix[i][min_col]);
                count++;
            }
            min_col++;
        }
        return List;
    }
}