package 灵茶山艾府.双指针滑动窗口.滑动窗口;

public class 找到最长的半重复子字符串 {
    public int longestSemiRepetitiveSubstring(String s) {
        int left = 0;
        int ans = 1;
        int ctn = 0;
        for (int right = 1; right < s.length(); right++) {
            if (s.charAt(right) == s.charAt(right - 1)){
                ctn++;
            }
            while (ctn > 2){
                if (s.charAt(left) == s.charAt(left + 1)){
                    ctn--;
                }
                left ++;
            }
            ans = Math.max(ans,right - left + 1 );
        }
        return ans;
    }
}
