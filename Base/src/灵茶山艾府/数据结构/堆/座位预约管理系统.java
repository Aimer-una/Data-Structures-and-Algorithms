package 灵茶山艾府.数据结构.堆;

import java.util.PriorityQueue;

public class 座位预约管理系统 {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    public 座位预约管理系统(int n) {
        for (int i = 1; i <= n; i++) {
            pq.offer(i);
        }
    }

    public int reserve() {
       return pq.poll();
    }

    public void unreserve(int seatNumber) {
        pq.offer(seatNumber);
    }
}
