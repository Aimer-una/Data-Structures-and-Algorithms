package 每日一题;

public class 按策略买卖股票的最佳时机 {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;
        int[] sum = new int[n+1];
        int[] sumSell = new int[n+1];
        for (int i = 0; i < n; i++) {
            sum[i+1] = sum[i] + prices[i] * strategy[i];
            sumSell[i+1] = sumSell[i] + prices[i];
        }
        long ans = sum[n];
        for (int i = k; i <= n; i++) {
            long res = sum[i-k] + sum[n] - sum[i] + sumSell[i] - sumSell[i-k / 2];
            ans = Math.max(ans,res);
        }
        return ans;
    }
}
