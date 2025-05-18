class Solution {
     private static List<String> columnStates=new ArrayList<>();
    private static int[][] t;
    private static final int MOD = 1_000_000_007;

    public static int solve(int remainingCol,int prevcolidx,int m){
        if(remainingCol==0) return 1;
        if (t[remainingCol][prevcolidx] != -1) return t[remainingCol][prevcolidx];

        int totalways=0;
        String prevcolumn=columnStates.get(prevcolidx);
    
        for(int nextcolidx=0; nextcolidx<columnStates.size();nextcolidx++){
           String nextcol=columnStates.get(nextcolidx);
           boolean valid=true;

           for(int i=0;i<m;i++){
            if(prevcolumn.charAt(i)==nextcol.charAt(i)){
                valid=false;
                break;
            }
           }
            if(valid){
                totalways=(totalways+solve(remainingCol-1,nextcolidx,m)) % MOD;
            }
        }
          return t[remainingCol][prevcolidx] = totalways;
    }

     public static void generateColumnStates(String currentColumn, int rowsRemaining, char prevColor) {
        if (rowsRemaining == 0) {
            columnStates.add(currentColumn);
            return;
        }

        // Colors: 'R' = Red, 'G' = Green, 'B' = Blue
        for (char color : new char[]{'R', 'G', 'B'}) {
            if (color == prevColor) continue;
            generateColumnStates(currentColumn + color, rowsRemaining - 1, color);
        }
    }
    public int numOfWays(int n) {
        int m=3;
        columnStates.clear();
        //step-1 generate column states
          generateColumnStates("", m, '#');

         int numColumnPatterns = columnStates.size();
        t = new int[n][numColumnPatterns];
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        int result = 0;
        for (int i = 0; i < numColumnPatterns; i++) {
            result = (result + solve(n - 1, i, m)) % MOD;
        }
        return result;
    }
}