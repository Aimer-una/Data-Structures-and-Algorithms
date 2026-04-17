package hot100;

public class 旋转图像 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // 1.转置
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) { // 遍历对角线下方元素
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        // 2.行翻转
        for (int[] row : matrix) {
            for (int j = 0; j < n / 2; j++) { // 遍历左半元素
                int tmp = row[j];
                row[j] = row[n-1-j];
                row[n-1-j] = tmp;
            }
        }
    }
}
