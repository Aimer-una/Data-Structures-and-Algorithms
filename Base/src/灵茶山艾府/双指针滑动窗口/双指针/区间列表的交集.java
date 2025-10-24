package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 区间列表的交集 {
    /**
     * 🌟 关键：如何求两个区间的交集？
     * 对于两个区间：
     * A[i] = [a1, a2]
     * B[j] = [b1, b2]
     * 它们的交集（如果存在）一定是：
     * 起点：lo = max(a1, b1) → 两个起点中更靠右的那个
     * 终点：hi = min(a2, b2) → 两个终点中更靠左的那个
     * 只有当 lo <= hi 时，才有有效交集！
     *
     */
    /**
     * 📌 举例：
     * [1,4] 和 [2,6] → lo = max(1,2)=2, hi = min(4,6)=4 → 交集 [2,4]
     * [1,2] 和 [3,5] → lo = 3, hi = 2 → 3 > 2 → 无交集
     */
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < firstList.length && j < secondList.length){
            int lo = Math.max(firstList[i][0],secondList[j][0]);
            int hi = Math.min(firstList[i][1],secondList[j][1]);
            // 起点的最大值<=终点的最小值就是有重合的
            if (lo <= hi){
                ans.add(new int[]{lo,hi});
            }

            if (firstList[i][1] < secondList[j][1]){
                i++;
            }else {
                j++;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
