package 灵茶山艾府.数据结构.栈;

public class 整理字符串 {
    public String makeGood(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (!sb.isEmpty() && !(c == sb.charAt(sb.length() - 1)) && (c == Character.toLowerCase(sb.charAt(sb.length() - 1)) || c == Character.toUpperCase(sb.charAt(sb.length() - 1)))){
                sb.deleteCharAt(sb.length() - 1);
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
