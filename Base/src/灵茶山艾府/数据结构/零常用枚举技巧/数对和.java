package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 数对和 {
    public List<List<Integer>> pairSums(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            int result = target - num;
            if (map.getOrDefault(result,0) > 0) {
                List<Integer> list = new ArrayList<>();
                list.add(result);
                list.add(num);
                ans.add(list);
                map.put(result,map.get(result) - 1);
                continue;
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return ans;
    }
}
