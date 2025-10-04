package 灵茶山艾府.双指针滑动窗口;

public class 可获得的最大点数 {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        // 中间不能拿的部分长度
        int m = n - k;
        int s = 0;
        for (int i = 0; i < m; i++) {
            s += cardPoints[i];
        }

        int total = s;
        int minSum = s;
        // 计算整个数组的总和 total 滑动长度为 m 的窗口，找最小和 minS
        for (int i = m; i < n; i++) {
            total += cardPoints[i];
            // 滑动窗口：右进左出
            s += cardPoints[i] - cardPoints[i-m];
            // 更新最小和
            minSum = Math.min(minSum,s);
        }
        // 用总数减去最小值，
        return total - minSum;
    }
}
