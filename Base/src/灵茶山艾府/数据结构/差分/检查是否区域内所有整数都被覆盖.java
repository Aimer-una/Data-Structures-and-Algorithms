package 灵茶山艾府.数据结构.差分;

public class 检查是否区域内所有整数都被覆盖 {

    public boolean isCovered(int[][] ranges, int left, int right) {
        // 差分
        int[] cnt = new int[52];
        for (int[] range : ranges) {
            cnt[range[0]] += 1;
            cnt[range[1]+1] -= 1;
        }
        // 前缀和
        for (int i = 1; i < cnt.length; i++) {
            cnt[i] += cnt[i-1];
        }
        for (int i = left; i <= right; i++) {
            if (cnt[i] == 0){
                return false;
            }
        }
        return true;
    }
}
