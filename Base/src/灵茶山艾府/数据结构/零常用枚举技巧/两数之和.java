package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.HashMap;
import java.util.Map;

public class 两数之和 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (map.containsKey(result)) {
                return new int[]{i,map.get(result)};
            }else {
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
