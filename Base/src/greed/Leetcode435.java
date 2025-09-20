package greed;

import java.util.Arrays;
// 435. 无重叠区间
public class Leetcode435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        int result = 0;
        // 左边值升序排序
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                result++;
                intervals[i][1] = Math.min(intervals[i][1], intervals[i - 1][1]);
            }

        }
        return result;
    }
}
