package dynamicprograming;
// 746. 使用最小花费爬楼梯
public class LeetCode746 {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= n ; i++) {
            dp[i] = Math.min(dp[i-1] + cost[i-1],dp[i-2] + cost[i-2]);
        }
        return dp[n];
    }
    // 空间优化：滚动变量
    public int minCostClimbingStairs2(int[] cost) {
        int n = cost.length;
        if (n <= 1){
            return 0;
        }
        int prev1 = 0;
        int prev2 = 0;
        int sum = 0;
        for (int i = 2; i <= n ; i++) {
           sum =  Math.min(prev1 + cost[i-1], prev2 + cost[i-2]);
            prev2 = prev1;
            prev1 = sum;
        }
        return sum;
    }

}
