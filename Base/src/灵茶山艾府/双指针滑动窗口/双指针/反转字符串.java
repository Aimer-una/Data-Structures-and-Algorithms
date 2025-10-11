package 灵茶山艾府.双指针滑动窗口.双指针;

public class 反转字符串 {
    public void reverseString(char[] s) {
        int right = s.length - 1;
        for (int left = 0; left < right; left++) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            right--;
        }
    }
}
