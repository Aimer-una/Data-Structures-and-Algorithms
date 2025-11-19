package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.HashMap;
import java.util.Map;

public class 统计梯形的数目I {
    private static final int MOD = 1_000_000_007;
    public int countTrapezoids(int[][] points) {
        Map<Integer,Integer> ctn = new HashMap<>();
        for (int[] point : points) {
            ctn.merge(point[1],1,Integer::sum); // 统计每一行（水平线）有多少个点
        }
        long ans = 0,s=0;
        for (Integer c : ctn.values()) {
            long k = (long)c * (c-1) / 2;
            ans += k * s;
            s += k;
        }
        return (int) (ans % MOD);
    }
}
