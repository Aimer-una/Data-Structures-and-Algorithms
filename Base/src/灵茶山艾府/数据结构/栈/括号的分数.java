package 灵茶山艾府.数据结构.栈;

import java.util.Deque;
import java.util.LinkedList;

public class 括号的分数 {
    public int scoreOfParentheses(String s) {
        Deque<Integer> stack = new LinkedList<>();
        stack.push(0); // 初始值为 0，表示“外层”的初始分数
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(0); // 开始新一层，初始化为 0
            }else { // s.charAt(i) == ')'
                Integer v = stack.pop(); // 弹出内层的分数（比如 `()` 得 1）
                int top = stack.pop() + Math.max(v*2 , 1);  // 上一层的分数 + 当前层的分数翻倍（如果 v > 0），否则是 1
                stack.push(top);
            }
        }
        return stack.peek();
    }
}
