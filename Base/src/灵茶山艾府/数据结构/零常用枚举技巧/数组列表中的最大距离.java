package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.List;

public class 数组列表中的最大距离 {
    public int maxDistance(List<List<Integer>> arrays) {
        int globalMin = arrays.get(0).get(0);
        int globalMax = arrays.get(0).get(arrays.get(0).size() - 1);
        int ans = 0;
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> curr = arrays.get(i);
            int currMax = curr.get(curr.size()-1);
            int currMin = curr.get(0);

            // 获取最大值
            ans = Math.max(ans,Math.abs(currMax - globalMin));
            ans = Math.max(ans,Math.abs(currMin - globalMax));

            //更新最大值和最小值
            globalMin = Math.min(globalMin,currMin);
            globalMax = Math.max(globalMax,currMax);
        }
        return ans;
    }
}
