package dynamicprograming;

import java.util.List;

public class BeiBao01 {
    public int beibao01(int n, int bagWeight){
        int[] weight = new int[n];
        int[] value = new int[n];
        int[][] dp = new int[n][bagWeight + 1];
        // 初始化
        for (int j = weight[0]; j <= bagWeight; j++) {
            dp[0][j] = value[0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= bagWeight; j++) {
                if (i<weight[i]){
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-weight[i]+value[i]]);
                }
            }
        }
        return dp[n - 1][bagWeight];
    }
}
