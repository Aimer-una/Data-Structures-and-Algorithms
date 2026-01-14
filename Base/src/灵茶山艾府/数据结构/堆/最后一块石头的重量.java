package 灵茶山艾府.数据结构.堆;

import java.util.PriorityQueue;

public class 最后一块石头的重量 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for (int stone : stones) {
            pq.offer(stone);
        }
        while (pq.size() > 1){
            Integer a = pq.poll();
            Integer b = pq.poll();
            int x = a - b;
            if (x > 0){
                pq.offer(x);
            }
        }
        return pq.isEmpty() ? 0:pq.poll();
    }
}
