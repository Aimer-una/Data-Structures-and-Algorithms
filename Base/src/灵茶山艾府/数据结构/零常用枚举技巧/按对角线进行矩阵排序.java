package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 按对角线进行矩阵排序 {
    public int[][] sortMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        // 第一排在右上，最后一排在左下
        // 每排从左上到右下
        // 令 k=i-j+n，那么右上角 k=1，左下角 k=m+n-1
        for (int k = 1; k < m + n; k++) {
            // 核心：计算 j 的最小值和最大值
            int MinJ = Math.max(n-k,0); // i=0 的时候取最小值，j=n-k，但不能是负数
            int MaxJ = Math.min(m+n-1-k,n-1); // i=m-1 的时候取最大值，j=m+n-1-k，但不能超过 n-1
            List<Integer> a = new ArrayList<>(MaxJ - MinJ + 1);
            for (int j = MinJ; j <= MaxJ; j++) {
                a.add(grid[k-n+j][j]);
            }
            a.sort(MinJ > 0 ? null : Comparator.reverseOrder());
            for (int j = MinJ; j <= MaxJ; j++) {
                grid[k-n+j][j] = a.get(j - MinJ);
            }
        }
        return grid;
    }
}
