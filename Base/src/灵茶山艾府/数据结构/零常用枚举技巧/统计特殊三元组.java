package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.HashMap;
import java.util.Map;

public class 统计特殊三元组 {
    public int specialTriplets(int[] nums) {
        final int MOD = 1_000_000_007;
        Map<Integer,Integer> pre = new HashMap<>();
        for (int num : nums) {
            pre.put(num,pre.getOrDefault(num,0)+1);
        }
        long ans = 0;
        Map<Integer,Integer> suf = new HashMap<>();
        for (int num : nums) {
            // 把当前的num从map中移除,因为j不在左右
            pre.put(num,pre.getOrDefault(num,0)-1);
            int target = num * 2;
            Integer rightCount = pre.getOrDefault(target, 0);
            Integer leftCount = suf.getOrDefault(target, 0);
            ans += (long) rightCount * leftCount;

            suf.put(num,suf.getOrDefault(num,0)+1);
        }
        return (int) (ans % MOD);
    }
}
