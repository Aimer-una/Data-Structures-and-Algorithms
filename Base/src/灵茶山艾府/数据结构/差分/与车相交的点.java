package 灵茶山艾府.数据结构.差分;

import java.util.List;

public class 与车相交的点 {
    public int numberOfPoints(List<List<Integer>> nums) {
        int size = nums.size();
        int ans = 0;
        int[] cnt = new int[102];
        for (List<Integer> num : nums) {
            cnt[num.get(0)] += 1;
            cnt[num.get(1)+1] -= 1;
        }
        // 计算前缀和
        for (int i = 1; i < cnt.length; i++) {
            cnt[i] += cnt[i-1];
        }
        // 判断有多少个位置大于0
        for (int i = 1; i < cnt.length; i++) {
            if (cnt[i] > 0){
                ans++;
            }
        }
        return ans;
    }
}
