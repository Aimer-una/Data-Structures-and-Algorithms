package hot100;

import java.util.HashSet;
import java.util.Set;

public class 最长连续序列 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int ans = 0;
        for (Integer x : set) {
            // 判断有没有比x还小的数，如果有就跳过直到找到最小的数
            if (set.contains(x-1)) {
                continue;
            }
            // 找到最小的数了，从这个数开始找前面有几个x+1的数
            int y = x + 1;
            while (set.contains(y)){ // 不断查找下一个数是否在哈希集合中
                y++;
            }
            ans = Math.max(ans,y-x);

        }
        return ans;
    }
}
