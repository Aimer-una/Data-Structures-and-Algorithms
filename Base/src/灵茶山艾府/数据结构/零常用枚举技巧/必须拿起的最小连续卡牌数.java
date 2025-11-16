package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 必须拿起的最小连续卡牌数 {
    public int minimumCardPickup(int[] cards) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < cards.length; i++) {
            if (map.containsKey(cards[i])) {
                ans = Math.min(ans,i - map.get(cards[i]));
            }
            map.put(cards[i],i);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans + 1 ;
    }
}
