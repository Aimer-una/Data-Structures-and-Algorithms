package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.Arrays;

public class 反转字符串中的元音字母 {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] charArray = s.toCharArray();
        while (left < right){
            while (left < right && !isVowel(charArray[left])){
                left++;
            }
            while (left < right && !isVowel(charArray[right])){
                right--;
            }
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
