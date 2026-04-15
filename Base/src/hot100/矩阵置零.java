package hot100;

public class 矩阵置零 {
    public void setZeroes(int[][] matrix) {
        // 行数
        int row = matrix.length;
        boolean[] rowArr = new boolean[row];
        // 列数
        int col = matrix[0].length;
        boolean[] colArr = new boolean[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0){
                    colArr[j] = rowArr[i] = true;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rowArr[i] || colArr[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
