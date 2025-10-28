package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.HashSet;
import java.util.Set;

public class 等差三元组的数目 {
    public int arithmeticTriplets(int[] nums, int diff) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if (set.contains(num - diff) && set.contains(diff + num)){
                ans++;
            }
        }
        return ans;
    }
}
