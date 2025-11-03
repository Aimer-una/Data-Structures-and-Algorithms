package 灵茶山艾府.双指针滑动窗口.双指针;

public class 股票平滑下跌阶段的数目 {
    public long getDescentPeriods(int[] prices) {
        long ans = 0;
        int i = 0;
        int n = prices.length;
        while (i < n){
            int start = i;
            i++;
            while (i < n && prices[i] - prices[i-1] == -1){
                i++;
            }
            int len = i - start;
            ans += (long) len * (len + 1)/2;
        }
        return ans;
    }
}
