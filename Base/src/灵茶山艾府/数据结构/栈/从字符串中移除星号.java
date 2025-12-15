package 灵茶山艾府.数据结构.栈;

public class 从字符串中移除星号 {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '*'){
                sb.deleteCharAt(sb.length() - 1);
                continue;
            }
            sb.append(chars[i]);
        }
       return sb.toString();
    }
}
