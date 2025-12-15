package 灵茶山艾府.数据结构.栈;

import java.util.ArrayDeque;
import java.util.Deque;

public class 验证栈序列 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = pushed.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
