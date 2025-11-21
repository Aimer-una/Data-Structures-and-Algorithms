package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.HashMap;
import java.util.Map;

public class 统计坏数对的数目 {
    /**
     * j - i != num[j] - num[i]
     * 用总对数减去好数 nums[i]−i=nums[j]−j
     * 设nums[i]−i=nums[j]−j 为  a[i]=nums[i]−i
     */
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        // 计算总的对数
        long ans = (long) n * (n-1) / 2;
        Map<Integer,Integer> cnt = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i] - i;
            ans -= cnt.getOrDefault(x,0);
            cnt.put(x,cnt.getOrDefault(x,0)+1);
        }
        return ans;
    }
}
