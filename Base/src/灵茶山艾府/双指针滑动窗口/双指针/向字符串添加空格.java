package 灵茶山艾府.双指针滑动窗口.双指针;

public class 向字符串添加空格 {
    public String addSpaces(String s, int[] spaces) {
        int j = 0;
        StringBuilder sb = new StringBuilder(s.length() + spaces.length);
        for (int i = 0; i < s.length(); i++) {
            if (j < spaces.length && spaces[j] == i){
                sb.append(' ');
                j++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
