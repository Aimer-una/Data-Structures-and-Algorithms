package hot100;

import java.util.ArrayList;
import java.util.List;

public class 螺旋矩阵 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        // 边界判断：空矩阵直接返回空列表
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return ans;
        }

        // 行数
        int rows = matrix.length;
        // 列数
        int cols = matrix[0].length;

        int total = rows * cols;  // 总共要走多少步

        // 创建一个辅助矩阵判断该位置是否已经被走过
        boolean[][] visited = new boolean[rows][cols];

        // 定义初始位置(起点：从左上角 (0, 0) 开始)
        int row = 0,col = 0;

        // 方向数组：定义 4 个方向（顺时针顺序）
        // {0, 1}  → 右（列+1）
        // {1, 0}  → 下（行+1）
        // {0, -1} → 左（列-1）
        // {-1, 0} → 上（行-1）
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        int directionIndex = 0;  // 当前方向索引：0=右，1=下，2=左，3=上

        // 开始走！一共走 total 步
        for (int i = 0; i < total; i++) {
            ans.add(matrix[row][col]);
            // 标记当前位置为已访问
            visited[row][col] = true;

            // 预测下一步位置（不真正移动，先试探）
            int nextRow = row + directions[directionIndex][0];
            int nextCol = col + directions[directionIndex][1];

            // 检查下一步是否合法：
            // - 超出边界？（<0 或 >= rows/columns）
            // - 或者已经访问过？
            if (nextRow < 0 || nextRow >= rows ||
                    nextCol < 0 || nextCol >= cols ||
                    visited[nextRow][nextCol]) {

                //  不合法！需要右转（顺时针切换方向）
                directionIndex = (directionIndex + 1) % 4;
            }

            // 真正要移动到的下一步
            row += directions[directionIndex][0];
            col += directions[directionIndex][1];
        }
        return ans;
    }
}
