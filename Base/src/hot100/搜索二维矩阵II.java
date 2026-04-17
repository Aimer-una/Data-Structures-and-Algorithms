package hot100;

public class 搜索二维矩阵II {
    public boolean searchMatrix(int[][] matrix, int target) {
        // 暴力枚举
        for (int[] rows : matrix) {
            for (int num : rows) {
                if (num == target){
                    return true;
                }
            }
        }
        return false;
    }
}
