package 每日一题;

public class 股票平滑下跌阶段的数目 {
    public long getDescentPeriods(int[] prices) {
        long ans = 0;
        long dec = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i > 0 && prices[i] == prices[i-1] - 1){
                dec++;
            }else {
                dec = 1;
            }
            ans += dec;
        }
        return ans;
    }
}
