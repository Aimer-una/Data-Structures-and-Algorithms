package 灵茶山艾府.数据结构.零常用枚举技巧;

public class 买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        int min = prices[0]; // ← 用来记录“到目前为止最大能赚多少”
        int ans = 0; // ← 用来记录“到目前为止最低的买入价”
        for (int price : prices) { // ← 遍历每一天的价格 p
            ans = Math.max(ans,price - min); // ① 如果今天卖出，能赚多少？
            min = Math.min(min,price); // ② 更新历史最低价
        }
        return ans;
    }
}
