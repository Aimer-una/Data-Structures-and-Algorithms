package 灵茶山艾府.双指针滑动窗口.滑动窗口;

import java.util.HashMap;
import java.util.Map;

public class 使库存平衡的最少丢弃次数 {
    public int minArrivalsToDiscard(int[] arrivals, int w, int m) {
        int result = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arrivals.length; i++) {
            int x = arrivals[i];
            // x 进入窗口
            Integer c = map.getOrDefault(x, 0);
            // x 的个数已达上限
            if (c == m){
                // 注意 x 在未来要离开窗口，但由于已经丢弃，不能在离开窗口时修改 cnt
                // 这里直接置为 0，未来离开窗口就是 cnt[0]--，不影响答案
                arrivals[i] = 0;
                result++;
            }else {
                map.put(x,c+1);
            }
            int left = i-w+1;
            if (left >= 0){
               // cnt.merge(arrivals[left], -1, Integer::sum);
               int key = arrivals[left];
                if (map.containsKey(key)) {
                    map.put(key,map.get(key)-1);
                }else {
                    map.put(key,-1);
                }
            }
        }
        return result;
    }
}
