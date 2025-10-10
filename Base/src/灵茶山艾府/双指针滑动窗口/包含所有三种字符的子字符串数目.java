package 灵茶山艾府.双指针滑动窗口;



public class 包含所有三种字符的子字符串数目 {
    /**
     * abcabc举例，当你找到第一个abc时，将left++，然后ans+=left，此时的left=1
     * ，代表当前有一个符合要求的子串。下一次找到bca，因为“现在符合条件，所以前面的一定也符合条件”，
     * 那么在left++之后，left所指代的就是包括窗口在内的，窗口及之前所有符合要求的子串数量（且无重合）
     *
     */
    public int numberOfSubstrings(String s) {
        int left = 0;
        int ans = 0;
        int[] cnt = new int[3];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
            while (cnt[0] >= 1 && cnt[1] >= 1 && cnt[2] >= 1){
                cnt[s.charAt(left) - 'a']--;
                left++;
            }
            ans += left;
        }
        return ans;
    }
}
