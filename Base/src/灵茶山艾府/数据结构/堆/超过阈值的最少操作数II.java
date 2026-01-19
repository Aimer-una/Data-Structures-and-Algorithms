package 灵茶山艾府.数据结构.堆;

import java.util.PriorityQueue;

public class 超过阈值的最少操作数II {
    public int minOperations(int[] nums, int k) {
        int ans = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (long num : nums) {
            pq.offer(num);
        }
        while (pq.peek() < k){
            Long x = pq.poll();
            Long y = pq.poll();
            pq.offer(x+x+y);
            ans++;
        }
        return ans;
    }
}
