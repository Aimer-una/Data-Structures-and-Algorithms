package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 合并区间 {
    public int[][] merge(int[][] intervals) {
        // 左端点从小到大排序
        Arrays.sort(intervals,(p,q)->p[0]-q[0]);
        List<int[]> ans = new ArrayList<>();
        for (int[] interval : intervals) {
            int m = ans.size();
            if (m > 0 && interval[0] <= ans.get(m-1)[1]){ // 可以合并
                ans.get(m-1)[1] = Math.max(interval[1],ans.get(m-1)[1]); // 更新右端点最大值
            }else {
                ans.add(interval);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
