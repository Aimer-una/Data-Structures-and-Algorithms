package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.HashMap;
import java.util.Map;

public class 存在重复元素II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k){
                    return true;
                }else {
                    map.put(nums[i],i);
                }
            }else {
                map.put(nums[i],i);
            }
        }
        return false;
    }

    // 优化1
    public boolean containsNearbyDuplicate1(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer lastIndex = map.get(nums[i]);
            if (lastIndex != null){
                if (i - lastIndex <= k) return true;
                map.put(nums[i],i);
            }else {
                map.put(nums[i],i);
            }
        }
        return false;
    }

    // 优化2合并两个分支
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(nums[i]);
            if (index != null && i - index <= k){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
