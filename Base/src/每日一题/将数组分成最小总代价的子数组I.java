package 每日一题;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 将数组分成最小总代价的子数组I {
    public int minimumCost(int[] nums) {
        // 从索引1开始对数组进行排序
        Arrays.sort(nums,1,nums.length);
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            ans += nums[i];
        }
        return ans;
    }
}
