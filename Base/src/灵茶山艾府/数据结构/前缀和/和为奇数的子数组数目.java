package 灵茶山艾府.数据结构.前缀和;


public class 和为奇数的子数组数目 {
    public int numOfSubarrays(int[] arr) {
        int k = 1000000007;
        int n = arr.length;
        // 计算前缀和
        int[] s = new int[n+1];
        for (int i = 0; i < n; i++) {
            s[i+1] = s[i] + arr[i];
        }
        int ans = 0;
        int[] cnt = new int[2];
        // 奇数 = 奇数+偶数
        // 奇数 = 偶数+奇数
        // count[0] 统计偶数数量，count[1] 统计奇数数量
        for (int i = 0; i < s.length; i++) {
            if (s[i] % 2 == 0){
                // 这个前缀和是偶数 + 加上前面所有的奇数
                ans = (ans + cnt[1]) % k;
                cnt[0]++;
            }else {
                // 这个前缀和是奇数 加上前面所有的偶数
                ans = (ans + cnt[0]) % k;
                cnt[1]++;
            }

        }
        return ans;
    }
}
