package 灵茶山艾府.数据结构.栈;

public class 移除相邻字符 {
    public String resultingString(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (sb.isEmpty()){
                sb.append(c);
                continue;
            }
            int abs = Math.abs(c - sb.charAt(sb.length() - 1));
            if (abs == 1 || abs == 25){
                sb.deleteCharAt(sb.length() - 1);
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
