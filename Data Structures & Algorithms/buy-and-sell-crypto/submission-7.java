class Solution {
    public int maxProfit(int[] prices) {
        int left = 0; // Buy
        int right = 1; // sell
        int ans = 0;
        int n = prices.length;
        while (right < n) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                ans = Math.max(profit, ans);
            } else {
                left = right;
            }
            right++;
        }
        return ans;
    }
}
