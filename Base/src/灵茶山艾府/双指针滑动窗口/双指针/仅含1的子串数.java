package 灵茶山艾府.双指针滑动窗口.双指针;

public class 仅含1的子串数 {
    public int numSub(String s) {
        final int MOD = 1_000_000_007;
        long ans = 0;
        int lastZero = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0'){
                lastZero = i;
            }else {
                ans += i - lastZero;
            }
        }
        return (int) (ans % MOD);
    }
}
