package string.leetcode;

public class LeetCode541 {
    public static void main(String[] args) {
        String s = "abcdefg";
        String s1 = reverseStr(s, 2);
        System.out.println(s1);
    }
    public static String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i+=2*k) {
            int start = i;
            int end = Math.min(charArray.length - 1,start+k-1);
            while (end > start){
                char temp = charArray[end];
                charArray[end] = charArray[start];
                charArray[start] = temp;
                start++;
                end--;
            }
        }
        return new String(charArray);
    }
}
