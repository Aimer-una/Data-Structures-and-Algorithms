package 灵茶山艾府.数据结构.栈;

import java.util.Deque;
import java.util.LinkedList;

public class 使括号有效的最少添加 {
    public int minAddToMakeValid(String s) {
        char[] chars = s.toCharArray();
        Deque<Character> stack = new LinkedList<>();
        for (char c : chars) {
            if (c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        return stack.size();
    }
}
