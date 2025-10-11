package 灵茶山艾府.双指针滑动窗口.滑动窗口;

import java.util.HashMap;
import java.util.Map;

public class 最多K个重复元素的最长子数组 {
    public int maxSubarrayLength(int[] nums, int k) {
        int left = 0;
        int ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            map.put(x,map.getOrDefault(x,0)+1);
            while (map.get(x) > k){
                map.put(nums[left],map.get(nums[left]) - 1 );
                if (map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }
            ans = Math.max(ans,i-left+1);
        }
        return ans;
    }
}
