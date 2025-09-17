package greed;
// 122. 买卖股票的最佳时机 II
public class LeetCode122 {
    public int maxProfit(int[] prices) {
        if (prices.length == 1){
            return 0;
        }
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - prices[i-1];
            if (profit > 0){
                sum += profit;
            }else {
                continue;
            }
        }
        return sum;
    }
}
