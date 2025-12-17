package 灵茶山艾府.数据结构.栈;


public class 删除字符串中的所有相邻重复项 {
    public String removeDuplicates(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (!sb.isEmpty() && c == sb.charAt(sb.length() - 1)){
                sb.deleteCharAt(sb.length() - 1);
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
