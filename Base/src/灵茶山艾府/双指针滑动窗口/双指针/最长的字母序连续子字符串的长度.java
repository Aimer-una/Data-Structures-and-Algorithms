package 灵茶山艾府.双指针滑动窗口.双指针;

public class 最长的字母序连续子字符串的长度 {
    public static void main(String[] args) {
        System.out.println(longestContinuousSubstring("abcde"));
    }
    public static int longestContinuousSubstring(String s) {
        int i = 0;
        int ans = 0;
        char[] charArray = s.toCharArray();
        int n = s.length();
        while (i < n){
            int start = i;
            i++;
            while (i < n && charArray[i] - charArray[i-1] == 1){
                i++;
            }
            ans = Math.max(ans,i-start);
        }
        return ans;
    }
}
