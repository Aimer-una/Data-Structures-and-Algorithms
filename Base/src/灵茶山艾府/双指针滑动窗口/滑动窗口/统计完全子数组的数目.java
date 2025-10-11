package 灵茶山艾府.双指针滑动窗口.滑动窗口;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 统计完全子数组的数目 {
    public int countCompleteSubarrays(int[] nums) {
        int left = 0;
        int ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.put(num,map.getOrDefault(num,0)+1);
            while (map.size() == set.size()){
                map.put(nums[left],map.get(nums[left])-1);
                if (map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }
            ans += left;
        }
        return ans;
    }
}
