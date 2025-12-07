package 灵茶山艾府.数据结构.差分;

public class 航班预订统计 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        // 计算差分
        /**
         * 为什么加2
         * 首先航班肯定最小也是1不可能有0这是+其中1个1的原因
         * 然后差分模板需要right+1，如果last是最后一个数那加1就索引越界异常了
         */
        int[] cnt = new int[n+2];
        for (int[] booking : bookings) {
            cnt[booking[0]] += booking[2];
            cnt[booking[1]+1] -= booking[2];
        }
        // 计算前缀和
        for (int i = 1; i < cnt.length; i++) {
            cnt[i] += cnt[i-1];
        }
        int[] ans = new int[n];
        // 计算结果
        for (int i = 0; i < n; i++) {
            ans[i] = cnt[i+1];
        }
        return ans;
    }
}
