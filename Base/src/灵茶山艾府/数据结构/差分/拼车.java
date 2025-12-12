package 灵茶山艾府.数据结构.差分;

public class 拼车 {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] cnt = new int[1002];
        // 差分
        for (int[] trip : trips) {
            cnt[trip[1]] += trip[0];
            cnt[trip[2]] -= trip[0];
        }
        // 前缀和
        for (int i = 1; i < cnt.length; i++) {
            cnt[i] += cnt[i-1];
        }
        for (int i = 1; i < cnt.length; i++) {
            if (cnt[i] > capacity){
                return false;
            }
        }
        return true;
    }
}
