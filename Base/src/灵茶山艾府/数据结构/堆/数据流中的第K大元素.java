package 灵茶山艾府.数据结构.堆;

import java.util.PriorityQueue;

public class 数据流中的第K大元素 {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int k;
    public 数据流中的第K大元素(int k, int[] nums) {
        this.k = k;
        for (int num : nums) {
            add(num);
        }

    }

    public int add(int val) {
        pq.offer(val);
        if (pq.size() > k){
            pq.poll();
        }
        return pq.peek();
    }
}
