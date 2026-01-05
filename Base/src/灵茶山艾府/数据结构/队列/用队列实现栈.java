package 灵茶山艾府.数据结构.队列;

import java.util.ArrayDeque;
import java.util.Deque;

public class 用队列实现栈 {
    Deque<Integer> deque;
    public 用队列实现栈() {
        deque = new ArrayDeque<>();
    }

    public void push(int x) {
        int n = deque.size();
        deque.addLast(x);
        for (int i = 0; i < n; i++) {
            deque.addLast(deque.pollFirst());
        }
    }

    public int pop() {
        return deque.pollFirst();
    }

    public int top() {
        return deque.peekFirst();
    }

    public boolean empty() {
        return deque.isEmpty();
    }
}
