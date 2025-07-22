package string.leetcode;

import java.util.Arrays;

/**
 * 清除空格
 * 反转字符串
 * 反转单词
 */
public class LeetCode151 {
    public static void main(String[] args) {
        String s1 = "a good   example";
        String s = reverseWords2(s1);
        System.out.println(s);
    }

    /**
     * 以下情况建议使用 StringBuilder：
     * 频繁拼接字符串（如在循环中）
     * 拼接大量字符串
     * 对性能有要求的场景
     */
    public static String reverseWords2(String s) {
        s = s.trim();                                    // 删除首尾空格
        System.out.println(s);
        int j = s.length() - 1, i = j;
        // 如果你不用 StringBuilder，而是用 String res = ""，每加一个单词都要创建一个新字符串，效率会非常低。
        StringBuilder res = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' '){
                i--;     // 搜索首个空格
            }
            // 包含起始索引 beginIndex 不包含结束索引 endIndex
            res.append(s.substring(i + 1, j + 1) + " "); // 添加单词
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;     // 跳过单词间空格
            }
            j = i;                                       // j 指向下个单词的尾字符
        }
        return res.toString().trim();                    // 转化为字符串并返回
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
                start = end + 1; // 更新 start 为下一个单词的起始位置（空格后一位）。
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
