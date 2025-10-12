package 灵茶山艾府.双指针滑动窗口.双指针;

public class 删除字符串两端相同字符后的最短长度 {
    public int minimumLength(String s) {
        int left = 0;
        int right = s.length() - 1;
        int sum = s.length();
        while (left < right && s.charAt(left) == s.charAt(right)){
            char c = s.charAt(left);
            while (left <= right && s.charAt(left) == c){
                left++;
            }
            while (left <= right && s.charAt(right) == c){
                right--;
            }
        }
        return right - left + 1;
    }
}
