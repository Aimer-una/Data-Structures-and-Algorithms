package 灵茶山艾府.数据结构.前缀和;

import java.util.HashMap;
import java.util.Map;

public class 统计美丽子数组数目 {
    public long beautifulSubarrays(int[] nums) {
        Map<Integer,Integer> cnt = new HashMap<>();
        cnt.put(0,1);
        long ans = 0;
        int s = 0;
        for (int x : nums) {
            s ^= x;
            Integer c = cnt.getOrDefault(s, 0);
            ans += c;
            cnt.put(s,c+1);
        }
        return ans;
    }
}
