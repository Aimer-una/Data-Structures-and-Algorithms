package 灵茶山艾府.数据结构.栈;

import java.util.ArrayDeque;
import java.util.Queue;

public class 最近的请求次数 {
    Queue<Integer> queue;
    public 最近的请求次数() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t - 3000){
            queue.poll();
        }
        return queue.size();
    }
}
