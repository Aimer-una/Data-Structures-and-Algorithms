package 灵茶山艾府.双指针滑动窗口;

public class 字符至少出现K次的子字符串I {
    public int numberOfSubstrings(String s, int k) {
        int left = 0;
        int[] ctn = new int[26];
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
           ctn[s.charAt(i) - 'a']++;
            while (ctn[s.charAt(i) - 'a'] >= k){
                ctn[s.charAt(left)- 'a']--;
                left++;
            }
            ans += left;
        }
        return ans;
    }
}
