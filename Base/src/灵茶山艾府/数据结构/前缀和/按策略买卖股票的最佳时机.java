package 灵茶山艾府.数据结构.前缀和;

public class 按策略买卖股票的最佳时机 {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;
        long[] sum = new long[n + 1];
        long[] sumSell = new long[n + 1];
        for (int i = 0; i < n; i++) {
            sum[i+1] = sum[i] + strategy[i] * prices[i];
        }
        for (int i = 0; i < n; i++) {
            sumSell[i+1] = sumSell[i] + prices[i];
        }
        // 不改变策略
        long ans = sum[n];
        for (int i = k; i <= n; i++) {
            // sum[n] - sum[i]：从 i 到 n-1 的原策略利润
            // sum[i - k]：从 0 到 i-k-1 的原策略利润
            // sumSell[i] - sumSell[i - k/2] = 最后 k/2 天的股价和
            long res = sum[i - k] + sum[n] - sum[i] + sumSell[i] - sumSell[i-k/2];
            ans = Math.max(ans,res);
        }
        return ans;
    }
}
