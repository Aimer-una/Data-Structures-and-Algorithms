package 灵茶山艾府.数据结构.前缀和;

import java.util.HashMap;
import java.util.Map;

public class 和相同的二元子数组 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // 前缀和
        int n = nums.length;
        int[] s = new int[n+1];
        for (int i = 0; i < n; i++) {
            s[i+1] = s[i] + nums[i];
        }
        int ans = 0;
        Map<Integer,Integer> cnt = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            ans += cnt.getOrDefault(s[i] - goal,0);
            cnt.put(s[i],cnt.getOrDefault(s[i],0)+1);
        }
        return ans;
    }
}
