package 灵茶山艾府.双指针滑动窗口.双指针;

public class 循环增长使字符串子序列等于另一个字符串 {
    public static void main(String[] args) {
        canMakeSubsequence("c","b");
    }
    public static boolean canMakeSubsequence(String str1, String str2) {
        int i = 0;
        int j = 0;
        while (i < str2.length() && j < str1.length()){
            if (str1.charAt(j) == str2.charAt(i) || str2.charAt(i) - str1.charAt(j) == 1 || str1.charAt(j) == 'z' && str2.charAt(i) == 'a'){
                i++;
            }
            j++;
        }
        return str2.length() == i;
    }
}
