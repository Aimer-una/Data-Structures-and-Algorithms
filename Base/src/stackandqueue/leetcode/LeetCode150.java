package stackandqueue.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode150 {
    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if (token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")){
                // 从栈的顶部取两个数并删除
                Integer pop1 = stack.pop();
                Integer pop2 = stack.pop();
                switch (token) {
                    case "+" -> stack.push(pop1 + pop2);
                    case "-" -> stack.push(pop2 - pop1);
                    case "*" -> stack.push(pop1 * pop2);
                    default -> stack.push(pop2 / pop1);
                }
            }else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}
