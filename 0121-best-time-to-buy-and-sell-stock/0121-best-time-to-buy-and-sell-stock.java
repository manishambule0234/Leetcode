class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int count = 0;
        for (int n : prices) {
            if (n < min) {
                min = n;
            } else {
                count = Math.max(count, (n - min));
            }
        }
        return count;

    }
}