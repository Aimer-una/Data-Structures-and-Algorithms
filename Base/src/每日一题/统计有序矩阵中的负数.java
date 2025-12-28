package 每日一题;

public class 统计有序矩阵中的负数 {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        for (int[] ints : grid) {
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] < 0){
                    ans++;
                }
            }
        }
        return ans;
    }
}
