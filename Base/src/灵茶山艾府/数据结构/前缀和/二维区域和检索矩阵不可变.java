package 灵茶山艾府.数据结构.前缀和;

public class 二维区域和检索矩阵不可变 {
    private final int[][] sum;
    public 二维区域和检索矩阵不可变(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        sum = new int[m+1][n+1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sum[row2+1][col2+1] - sum[row2+1][col1] - sum[row1][col2+1] + sum[row1][col1];
    }
}
