package 灵茶山艾府.数据结构.队列;

import java.util.ArrayDeque;
import java.util.Deque;

public class 设计自助结算系统 {
    Deque<Integer> deque;
    Deque<Integer> maxDeque;
    public 设计自助结算系统() {
        deque = new ArrayDeque();
        maxDeque = new ArrayDeque<>();
    }

    public int get_max() {
        if (maxDeque.isEmpty()){
            return -1;
        }
        return maxDeque.getFirst();
    }

    public void add(int value) {
        while (!maxDeque.isEmpty() && maxDeque.getLast() < value){
            maxDeque.removeLast();
        }
        maxDeque.addLast(value);
        deque.addLast(value);
    }

    public int remove() {
        if (deque.isEmpty()){
            return -1;
        }
        Integer removed = deque.removeFirst();
        if (removed.equals(maxDeque.getFirst())){
            maxDeque.removeFirst();
        }
        return removed;
    }
}
