package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class K和数对的最大数目 {

    public  int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for (int num : nums) {
            int target = k - num;
            if (map.getOrDefault(target,0) > 0) {
                ans++;
                map.put(target,map.get(target)-1);
            }else {
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        return ans;
    }
}
