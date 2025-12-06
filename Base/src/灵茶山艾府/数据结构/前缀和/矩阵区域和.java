package 灵茶山艾府.数据结构.前缀和;

public class 矩阵区域和 {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        // 行
        int m = mat.length;
        // 列
        int n = mat[0].length;
        int[][] res = new int[m][n];
        int [][] s = new int[m+1][n+1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                s[i+1][j+1] = s[i+1][j] + s[i][j+1] - s[i][j] + mat[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int r1 = Math.max(0, i - k);
                int r2 = Math.min(m - 1, i + k);
                int c1 = Math.max(0, j - k);
                int c2 = Math.min(n - 1, j + k);
                // 转换为前缀和数组 s 的下标（全部 +1）
                res[i][j] = s[r2 + 1][c2 + 1]
                        - s[r2 + 1][c1]
                        - s[r1][c2 + 1]
                        + s[r1][c1];
            }
        }
        return res;
    }
}
