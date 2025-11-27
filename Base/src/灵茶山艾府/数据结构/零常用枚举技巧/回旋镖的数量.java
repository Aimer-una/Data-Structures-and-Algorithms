package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.HashMap;
import java.util.Map;

public class 回旋镖的数量 {
    public int numberOfBoomerangs(int[][] points) {
        int ans = 0;
        Map<Integer,Integer> ctn = new HashMap<>();
        for (int[] p1 : points) {
            ctn.clear();
            for (int[] p2 : points) {
                int d2 = (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
                Integer c = ctn.getOrDefault(d2, 0);
                ans += c * 2;
                ctn.put(d2,c+1);
            }
        }
        return ans;
    }
}
