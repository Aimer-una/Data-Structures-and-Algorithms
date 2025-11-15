package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.HashMap;
import java.util.Map;

public class 好数对的数目 {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for (int num : nums) {
            // 如果 x 之前出现过 c 次，就能新增 c 个数对
            ans += map.getOrDefault(num,0);
            // 然后把 x 的计数 +1
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return ans;
    }
}
