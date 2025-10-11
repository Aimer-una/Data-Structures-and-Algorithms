package 灵茶山艾府.双指针滑动窗口.双指针;

public class 垂直翻转子矩阵 {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int left = x;
        int right = x + k - 1;
        while (left < right) {
            for (int i = y; i < y + k; i++) {
                int temp = grid[left][i];
                grid[left][i] = grid[right][i];
                grid[right][i] = temp;
            }
            left++;
            right--;
        }

        return grid;
    }
}
