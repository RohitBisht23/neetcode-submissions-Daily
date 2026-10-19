class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for(int i=0; i<prices.length; i++) {
            int buy = prices[i];
            for(int j=i+1; j<prices.length; j++) {
                profit = Math.max(profit, prices[j] - buy);
            }
        }
        return profit;
    }
}
