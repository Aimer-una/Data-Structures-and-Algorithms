package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.HashSet;
import java.util.Set;

public class 对角线上不同值的数量差 {
    public int[][] differenceOfDistinctValues(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] ans = new int[m][n];
        Set<Integer> set = new HashSet<>();
        for (int k = 1; k < m + n; k++) {
            int minJ = Math.max(n-k,0);
            int maxJ = Math.min(n+m-1-k,n-1);
            set.clear();
            for (int j = minJ ; j <= maxJ; j++) {
                int i = k - n + j;
                ans[i][j] = set.size();
                set.add(grid[i][j]);
            }
            set.clear();
            for (int j = maxJ; j >= minJ; j++) {
                int i = k - n + j;
                ans[i][j] = Math.abs(ans[i][j] - set.size());
                set.add(grid[i][j]);
            }
        }
        return ans;
    }
}
