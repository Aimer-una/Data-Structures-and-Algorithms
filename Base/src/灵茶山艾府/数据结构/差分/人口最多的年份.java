package 灵茶山艾府.数据结构.差分;

public class 人口最多的年份 {
    public int maximumPopulation(int[][] logs) {
        int[] cnt = new int[2052];
        // 差分
        for (int[] log : logs) {
            cnt[log[0]] += 1;
            // x 在闭区间 [birthi, deathi - 1]
            cnt[log[1]] -= 1;
        }
        // 前缀和
        for (int i = 1950; i < cnt.length; i++) {
            cnt[i] += cnt[i-1];
        }
        int minYear = 0;
        int peopleNum = 0;
        for (int i = 1950; i < cnt.length; i++) {
            if (cnt[i] > peopleNum){
                peopleNum = cnt[i];
                minYear = i;
            }
        }
        return minYear;
    }
}
