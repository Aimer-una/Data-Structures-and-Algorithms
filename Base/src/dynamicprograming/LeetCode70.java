package dynamicprograming;
// 70. 爬楼梯
public class LeetCode70 {
    public int climbStairs(int n) {
        if (n <= 1) return 1;

        int prev1 = 1;
        int prev2 = 1;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = prev1 + prev2;
            prev1 = prev2;
            prev2 = sum;
        }
       return prev2;
    }
}
