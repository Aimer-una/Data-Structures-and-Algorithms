package 灵茶山艾府.双指针滑动窗口.双指针;

public class 统计同质子字符串的数目 {
    public int countHomogenous(String s) {
        int i = 0;
        int n = s.length();
        char[] chars = s.toCharArray();
        final int MOD = 1_000_000_007;
        long sum = 0;
        while (i < n){
            int start = i;
            i++;
            while (i < n && chars[i] == chars[i-1]){
                i++;
            }
            long len = i - start;
            sum = (sum + len * (len+1) / 2) % MOD;
        }
        return (int) sum;
    }
}
