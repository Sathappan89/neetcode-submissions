class Solution {
    public int maxProfit(int[] prices) {
        int left = 0, right=1;
        int n = prices.length;
        int ans=0;
        while(right<n){
            if(prices[left]<prices[right]){
                int profit = prices[right]-prices[left];
                ans = Integer.max(ans, profit);
            }else{
                left=right;
            }
            right++;
        }
    return ans;
    }
}
