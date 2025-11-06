package 灵茶山艾府.双指针滑动窗口.双指针;

public class 所有元音按顺序排布的最长子字符串 {
    public int longestBeautifulSubstring(String word) {
        char[] chars = word.toCharArray();
        int n = word.length();
        int i = 0;
        int ans = 0;
        while (i < n){
            if (chars[i] != 'a'){
                i++;
                continue;
            }
            int start = i;
            int vowelCount = 1;
            i++;
            while (i < n && isVowel(chars[i]) && chars[i] -'a' >= chars[i-1] - 'a'){
                // 只有当元音“升级”时，才增加种类数
                if (chars[i] > chars[i - 1]) {
                    vowelCount++;
                }
                i++;
            }
            if (vowelCount == 5){
                ans = Math.max(ans,i-start);
            }
        }
        return ans;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
