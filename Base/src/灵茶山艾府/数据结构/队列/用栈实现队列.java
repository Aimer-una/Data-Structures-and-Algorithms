package 灵茶山艾府.数据结构.队列;

import java.util.ArrayDeque;
import java.util.Deque;

public class 用栈实现队列 {
    Deque<Integer> inStack;
    Deque<Integer> outStack;
    public 用栈实现队列() {
        inStack = new ArrayDeque<>();
        outStack = new ArrayDeque<>();
    }

    public void push(int x) {
        inStack.push(x);
    }


    public int pop() {
        if (outStack.isEmpty()){
            in2out();
        }
        return outStack.pop();
    }

    public int peek() {
        if (outStack.isEmpty()){
            in2out();
        }
        return outStack.peek();
    }

    public boolean empty() {
        return outStack.isEmpty() && inStack.isEmpty();
    }

    private void in2out(){
        while (!inStack.isEmpty()){
            outStack.push(inStack.pop());
        }
    }
}
