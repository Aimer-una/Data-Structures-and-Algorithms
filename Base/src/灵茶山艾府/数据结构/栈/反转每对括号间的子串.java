package 灵茶山艾府.数据结构.栈;

import java.util.Deque;
import java.util.LinkedList;

public class 反转每对括号间的子串 {
    public String reverseParentheses(String s) {
        Deque<String> stack = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '('){
                stack.push(sb.toString());
                sb.setLength(0);
            }else if (c == ')'){
                sb.reverse();
                sb.insert(0,stack.pop());

            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
