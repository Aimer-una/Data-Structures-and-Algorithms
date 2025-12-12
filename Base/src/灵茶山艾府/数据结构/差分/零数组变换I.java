package 灵茶山艾府.数据结构.差分;

public class 零数组变换I {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        // 差分
        int[] cnt = new int[n+1];
        for (int[] query : queries) {
            cnt[query[0]] += 1;
            cnt[query[1]+1] -=1;
        }
        // 前缀和
        for (int i = 1; i < cnt.length; i++) {
            cnt[i] += cnt[i-1];
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] - cnt[i] > 0){
                return false;
            }
        }
        return true;
    }
}
