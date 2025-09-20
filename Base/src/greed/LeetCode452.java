package greed;

import java.util.Arrays;
// 452. 用最少数量的箭引爆气球
public class LeetCode452 {
    public int findMinArrowShots(int[][] points) {
        int result = 1;
        // 左边值升序排序
        Arrays.sort(points,(a,b)->
            Integer.compare(a[0],b[0]));

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > points[i-1][1]){
                result++;
            }else {
               points[i][1] = Math.min(points[i][1] , points[i-1][1]);
            }
        }
        return result;
    }
}
