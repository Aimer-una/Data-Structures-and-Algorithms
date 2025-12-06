package 灵茶山艾府.数据结构.前缀和;

import java.util.HashMap;
import java.util.Map;

public class 元素和小于等于k的子矩阵的数目 {
    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] s = new int[m+1][n+1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                s[i+1][j+1] = s[i+1][j] + s[i][j+1] - s[i][j] + grid[i][j];
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (s[i+1][j+1] <= k){
                    ans++;
                }
            }
        }
        return ans;
    }
}
