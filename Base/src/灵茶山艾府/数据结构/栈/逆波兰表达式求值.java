package 灵茶山艾府.数据结构.栈;

import java.util.Deque;
import java.util.LinkedList;

public class 逆波兰表达式求值 {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        for (String s : tokens) {
            if (isValidNumber(s)) {
                stack.push(Integer.parseInt(s));
            } else {
                Integer pop1 = stack.pop();
                Integer pop2 = stack.pop();
                switch (s) {
                    case "*":
                        stack.push(pop2 * pop1);
                        break;
                    case  "/":
                        stack.push(pop2 / pop1);
                        break;
                    case "+":
                        stack.push(pop2 + pop1);
                        break;
                    case "-":
                        stack.push(pop2 - pop1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    private boolean isValidNumber(String s) {
        if ("*".equals(s) || "+".equals(s) || "/".equals(s) || "-".equals(s)) {
            return false;
        }
        return true;
    }
}
