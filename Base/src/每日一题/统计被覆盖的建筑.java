package 每日一题;

import java.util.Arrays;

public class 统计被覆盖的建筑 {

    /**
     * 代码部分	作用
     * rowMin[y], rowMax[y]	记录第 y 行的最左/最右 x 坐标
     * colMin[x], colMax[x]	记录第 x 列的最下/最上 y 坐标
     * rowMin[y] < x	说明左边有建筑
     * x < rowMax[y]	说明右边有建筑
     * colMin[x] < y	说明下边有建筑
     * y < colMax[x]	说明上边有建筑
     */
    public int countCoveredBuildings(int n, int[][] buildings) {
        int[] rowMin = new int[n+1];
        int[] rowMax = new int[n+1];
        int[] colMin = new int[n+1];
        int[] colMax = new int[n+1];
        Arrays.fill(rowMin,n+1);
        Arrays.fill(colMin,n+1);
        for (int[] p : buildings) {
            int x = p[0],y = p[1];
            rowMin[y] = Math.min(x,rowMin[y]);
            rowMax[y] = Math.max(x,rowMax[y]);
            colMin[x] = Math.min(y,colMin[x]);
            colMax[x] = Math.max(y,colMax[x]);
        }
        int ans = 0;
        for (int[] p : buildings) {
            int x = p[0],y = p[1];
            if (x < rowMax[y] && x > rowMin[y] && y < colMax[x] && y > colMin[x]){
                ans++;
            }
        }
        return ans;
    }
}
