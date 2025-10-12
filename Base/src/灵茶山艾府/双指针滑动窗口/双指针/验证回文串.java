package 灵茶山艾府.双指针滑动窗口.双指针;

public class 验证回文串 {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = result.length() - 1;
        char[] charArray = result.toCharArray();
        while (left < right){
            if (charArray[left] != charArray[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindrome1(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            if (!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            else if (Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))){
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
    }
}
