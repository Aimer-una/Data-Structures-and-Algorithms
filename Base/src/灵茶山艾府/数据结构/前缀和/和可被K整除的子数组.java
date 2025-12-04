package 灵茶山艾府.数据结构.前缀和;

public class 和可被K整除的子数组 {
    public int subarraysDivByK(int[] nums, int k) {
        int[] cnt = new int[k];
        // 同余就可以整除
        int ans = 0;
        int s = 0;
        for (int x : nums) {
            cnt[s]++;
            // 累计前缀和的余数！
            s = (s + x) % k;
            if (s < 0){
                s = s + k;
            }
            ans += cnt[s];
        }
        return ans;
    }
}
