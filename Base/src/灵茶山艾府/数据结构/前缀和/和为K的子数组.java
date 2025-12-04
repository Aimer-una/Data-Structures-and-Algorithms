package 灵茶山艾府.数据结构.前缀和;

import java.util.HashMap;
import java.util.Map;

public class 和为K的子数组 {
    public int subarraySum(int[] nums, int k) {
        // 计算前缀和
        int n = nums.length;
        int[] s = new int[n+1];
        for (int i = 0; i < nums.length; i++) {
            s[i+1] = s[i] + nums[i];
        }
        // 存入hashmap集合中
        // 因为 s[j]−(s[j]−k)=k
        Map<Integer,Integer> ctn = new HashMap<>();
        int ans = 0;
        for (int i : s) {
            ans += ctn.getOrDefault(i - k,0);
            ctn.put(i,ctn.getOrDefault(i,0)+1);
        }
        return ans;
    }
}
