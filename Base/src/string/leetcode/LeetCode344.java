package string.leetcode;

public class LeetCode344 {
    public static void main(String[] args) {
        String test = "hello";
        char[] charArray = test.toCharArray();
        reverseString(charArray);
        System.out.println(charArray);
    }
    public static void reverseString(char[] s) {
        int right = s.length - 1;
        int left = 0;
        while (right > left){
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            right--;
            left++;
        }
    }
}
