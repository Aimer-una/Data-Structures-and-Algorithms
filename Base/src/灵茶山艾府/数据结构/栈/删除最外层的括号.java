package 灵茶山艾府.数据结构.栈;

public class 删除最外层的括号 {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int depth = 0;
        for (char c : s.toCharArray()) {
            if (c == '('){
                if (depth > 0){
                    sb.append(c);
                }
                depth++;
            }else {
                depth--;
                if (depth > 0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
