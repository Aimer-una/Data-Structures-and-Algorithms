package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.Arrays;

public class 直角三角形 {
    public long numberOfRightTriangles(int[][] grid) {
        int n = grid[0].length;
        int[] colSum = new int[n];
        Arrays.fill(colSum,-1);
        for (int[] row  : grid) {
            for (int j = 0; j < n; j++) {
                colSum[j] += row [j];
            }
        }

        long ans = 0;
        for (int[] row : grid) {
            // 计算当前行的（1的数量）
            int rowSum = -1;
            for (int x : row) {
                rowSum += x;
            }
            for (int j = 0; j < row.length; j++) {
                if (row[j] == 1){
                    ans += rowSum * colSum[j];
                }
            }
        }
        return ans;
    }
}
