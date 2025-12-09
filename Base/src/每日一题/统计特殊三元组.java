package 每日一题;

import java.util.HashMap;
import java.util.Map;

public class 统计特殊三元组 {
    /**
     * 枚举中间
     */

    public int specialTriplets(int[] nums) {
        final int MOD = 1_000_000_007;
        long ans = 0;
        Map<Integer,Integer> suf = new HashMap<>();
        // 统计j+1到n-1的数
        for (int num : nums) {
            suf.put(num,suf.getOrDefault(num,0)+1);
        }
        // 统计j-1,j的数
        Map<Integer,Integer> pre = new HashMap<>();
        for (int num : nums) {
            // 先去除j
            suf.put(num,suf.getOrDefault(num,0)-1);
            // 计算目标值
            int target = num * 2;
            // 找左右两边是否存在target,然后相乘
            Integer right = suf.getOrDefault(target,0);
            Integer left = pre.getOrDefault(target,0);
            ans += (long)right * left;
            // 将num加入到j-1的hash表中
            pre.put(num,pre.getOrDefault(num,0)+1);
        }
        return (int) (ans % MOD);
    }
}
