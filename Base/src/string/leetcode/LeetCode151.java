package string.leetcode;

import java.util.Arrays;

/**
 * 清除空格
 * 反转字符串
 * 反转单词
 */
public class LeetCode151 {
    public static void main(String[] args) {
        String s1 = "  hello world  ";
        String s = removeSpace(s1);
        System.out.println(s);
    }
    public String reverseWords(String s) {
        String noExtraSpace = removeSpace(s); // 去除空格
        char[] chars = noExtraSpace.toCharArray();
        reverseString(chars);         // 反转整个字符串
        reverseEachWord(chars);       // 反转每个单词
        return new String(chars);

    }
    private static String removeSpace(String s) {
        char[] charArray = s.toCharArray();
        int slow = 0;
        for (int fast = 0; fast < charArray.length; fast++) {
            if (charArray[fast] != ' '){
                if(slow != 0){
                    charArray[slow++] = ' ';
                }
                while (fast < charArray.length && charArray[fast] != ' '){
                    charArray[slow] = charArray[fast];
                    slow++;
                    fast++;
                }
            }
        }
        // 构造结果字符串，只取有效部分
        return new String(charArray, 0, slow);
    }

    // 反转字符串
    public static void reverseString(char[] charArray) {
        int right = charArray.length - 1;
        int left = 0;
        while (right > left){
            char temp = charArray[right];
            charArray[right] = charArray[left];
            charArray[left] = temp;
            right--;
            left++;
        }
    }

    // 反转单词
    // 第三步：逐个反转每个单词
    public static void reverseEachWord(char[] chars) {
        int start = 0;
        for (int end = 0; end <= chars.length; end++) {
            // 当遇到空格或到达末尾时，反转当前单词
            if (end == chars.length || chars[end] == ' ') {
                reverse(chars, start, end - 1);
                start = end + 1;
            }
        }
    }

    // 辅助方法：反转字符数组从 start 到 end 的部分
    private static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
