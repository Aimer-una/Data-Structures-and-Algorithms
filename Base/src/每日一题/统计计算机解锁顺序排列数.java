package 每日一题;

public class 统计计算机解锁顺序排列数 {
    // 求共有多少种 [0, 1, 2, ..., (n - 1)] 的排列方式（必须解锁所有的密码机）
    // ，能够表示从编号为 0 的计算机（唯一初始解锁的计算机）开始解锁所有计算机的有效顺序。
    public int countPermutations(int[] complexity) {
        long ans = 1;
        final int MOD = 1_000_000_007;
        for (int i = 1; i < complexity.length; i++) {
            if (complexity[i] <= complexity[0]){
                return 0;
            }
            ans = ans * i % MOD;
        }
        return (int) ans;
    }
}
