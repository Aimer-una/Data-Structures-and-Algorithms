package stackandqueue.leetcode;

import java.util.Stack;

public class LeetCode232 {
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    public LeetCode232() {
        stackIn = new Stack<>(); // 入栈
        stackOut = new Stack<>(); // 出栈
    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {
        dumpStackIn();
        return stackOut.pop();
    }

    public int peek() {
        dumpStackIn();
        return stackOut.peek();
    }

    public boolean empty() {
        return stackOut.isEmpty() && stackIn.empty();
    }

    private void dumpStackIn(){
        if (!stackOut.isEmpty()){
            return;
        }
        while (!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }
    }
}
