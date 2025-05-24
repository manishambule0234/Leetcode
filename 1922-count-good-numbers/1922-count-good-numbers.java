class Solution {
    private static final int MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        return (int) helper(n)%MOD;
    }
    public static long helper(long n){
        if (n == 0) return 1;
        if (n == 1) return 5;

        long prev = helper(n - 1);
        if (n % 2 == 0) {
            return (4 * helper(n - 1)) % MOD;
        } else {
            return (5 * helper(n - 1)) % MOD;
        }

    }
}