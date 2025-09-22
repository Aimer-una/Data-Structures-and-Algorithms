package greed;
// 738. 单调递增的数字
public class LeetCode783 {
    public int monotoneIncreasingDigits(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int start = chars.length;

        for (int i = chars.length - 1; i > 0 ; i--) {
            if (chars[i-1] > chars[i]){
                chars[i-1]--;
                start = i;
            }
        }
        for (int i = start; i < chars.length; i++) {
            chars[i] = '9';
        }
        return Integer.parseInt(new String(chars));
    }
}
