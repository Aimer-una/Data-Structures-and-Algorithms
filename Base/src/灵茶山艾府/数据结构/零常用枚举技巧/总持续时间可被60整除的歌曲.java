package 灵茶山艾府.数据结构.零常用枚举技巧;

public class 总持续时间可被60整除的歌曲 {
    public int numPairsDivisibleBy60(int[] time) {
        int[] cnt = new int[60];
        int ans = 0;
        for (int t : time) {
            int r = t % 60;
            // 寻找r需要的数
            int need = (60 - r) % 60;
            // 之前有多少首“搭档”，就能组成多少对
            ans += cnt[need];
            cnt[r]++;
        }
        return ans;
    }
}
