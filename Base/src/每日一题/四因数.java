package 每日一题;

public class 四因数 {
    public int sumFourDivisors(int[] nums) {
        int[] factorCount = new int[100001]; // 第 i 页写着：数字 i 有几个因数
        int[] factorSum   = new int[100001]; // 第 i 页写着：数字 i 的所有因数加起来是多少
        for (int i = 1; i <= 100000; i++) {
            for (int j = i; j <= 100000 ; j+=i) {
                factorCount[j]++;
                factorSum[j] += i;
            }
        }
        int ans = 0;
        for (int x : nums) {
            if (factorCount[x] == 4){
                ans += factorSum[x];
            }
        }
        return ans;
    }
}
