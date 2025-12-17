package 灵茶山艾府.数据结构.栈;

import java.util.ArrayDeque;
import java.util.Deque;

public class 删除子串后的字符串最小长度 {
    public int minLength(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (!stack.isEmpty() && (c == 'B' && stack.peek() == 'A' || c == 'D' && stack.peek() == 'C')){
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        return stack.size();
    }
}
