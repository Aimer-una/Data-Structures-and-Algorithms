package 灵茶山艾府.双指针滑动窗口.双指针;

public class 找出长度为K的特殊子字符串 {
    public boolean hasSpecialSubstring(String s, int k) {
        int i = 0;
        char[] chars = s.toCharArray();
        int n = s.length();
        while (i < n){
            int start = i;
            i++;
            while (i < n && chars[i] == chars[i-1]){
                i++;
            }
            if (i - start == k){
                return true;
            }
        }
        return false;
    }
}
