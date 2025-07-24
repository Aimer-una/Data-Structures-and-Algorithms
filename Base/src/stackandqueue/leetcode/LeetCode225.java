package stackandqueue.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode225 {
    Queue<Integer> queue;
    public LeetCode225() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
    }
    //返回顶层元素并删除
    public int pop() {
        rePosition();
        return queue.poll();
    }

    // 返回顶层元素
    public int top() {
        rePosition();
        Integer result = queue.poll();
        queue.add(result);
        return result;
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    private void rePosition(){
        int size = queue.size();
        size--;
        while (size > 0){
            queue.add(queue.poll());
            size--;
        }
    }
}
