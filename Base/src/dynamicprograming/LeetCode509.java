package dynamicprograming;
// 509. 斐波那契数
public class LeetCode509 {
    public int fib(int n) {
        if (n <= 1) return n;
        int dpZero = 0;
        int dpOne = 1;
        int sum = 0;
        for (int i = 2; i <= n ; i++) {
            sum = dpZero + dpOne;
            dpZero = dpOne;
            dpOne = sum;
        }
        return dpOne;
    }
}
