package 每日一题;

public class 最大方阵和 {
    public long maxMatrixSum(int[][] matrix) {
        long ans = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int[] ints : matrix) {
            for (int x : ints) {
                if (x < 0){
                    // 先把负数都变成正数
                    x = -x;
                    // 判断是否是偶数个负数还是奇数个负数，偶数个直接返回所有正数之和，奇数个返回所有正数之和减去负数绝对值 * 2
                    sum++;
                }
                min = Math.min(min,x);
                ans += x;
            }
        }
        if (sum % 2 != 0){
            ans -= min * 2L;
        }
        return ans;
    }
}
