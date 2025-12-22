package 灵茶山艾府.数据结构.栈;

import java.util.Deque;
import java.util.LinkedList;

public class 有效的括号 {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        if (s.length() % 2 != 0){
            return false;
        }
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '('){
                stack.push(')');
            }else if (c == '['){
                stack.push(']');
            }else if (c == '{'){
                stack.push('}');
            }else {
                if (stack.isEmpty() || stack.peek() != c){
                    return false;
                }else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
