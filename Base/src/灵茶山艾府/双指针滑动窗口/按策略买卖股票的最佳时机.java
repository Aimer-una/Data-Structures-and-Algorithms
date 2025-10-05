package 灵茶山艾府.双指针滑动窗口;

// 待做
public class 按策略买卖股票的最佳时机 {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int sum = 0;
        int sumMax = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i] * strategy[i];
            int left = i-k+1;
            if (left < 0){
                continue;
            }
            sumMax = Math.max(sumMax,sum);
            int index = k/2;
        }
        return 0;
    }
}
