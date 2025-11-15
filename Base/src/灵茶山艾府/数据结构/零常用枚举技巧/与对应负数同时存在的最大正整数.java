package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 与对应负数同时存在的最大正整数 {
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = -1;
        for (int num : nums) {
            if (set.contains(-num)) {
                max = Math.max(max,Math.abs(num));
            }else {
                set.add(num);
            }
        }
        return max;
    }
}
