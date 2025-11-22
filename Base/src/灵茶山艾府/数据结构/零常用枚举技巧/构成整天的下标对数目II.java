package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.HashMap;
import java.util.Map;

public class 构成整天的下标对数目II {
    public long countCompleteDayPairs(int[] hours) {
        long ans = 0;
        Map<Integer,Integer> cnt = new HashMap<>();
        for (int hour : hours) {
            int h = hour % 24;
            int need= (24 - h) % 24;
            ans += cnt.getOrDefault(need,0);
            cnt.put(h,cnt.getOrDefault(h,0)+1);
        }
        return ans;
    }

    public long countCompleteDayPairs1(int[] hours) {
        long ans = 0;
        int[] cnt = new int[24];
        for (int hour : hours) {
            int h = hour % 24;
            int need= (24 - h) % 24;
            ans += cnt[need];
            cnt[h]++;
        }
        return ans;
    }
}
