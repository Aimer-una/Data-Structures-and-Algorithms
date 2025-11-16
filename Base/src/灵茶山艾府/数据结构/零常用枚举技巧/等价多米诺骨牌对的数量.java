package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.HashMap;
import java.util.Map;

public class 等价多米诺骨牌对的数量 {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for (int[] dominoe : dominoes) {
            int a = Math.max(dominoe[0],dominoe[1]);
            int b = Math.min(dominoe[0],dominoe[1]);
            int key = b * 10 + a;
            ans += map.getOrDefault(key,0);
            map.put(key,map.getOrDefault(key,0)+1);
        }
        return ans;
    }
}
