package 灵茶山艾府.数据结构.堆;

import java.util.PriorityQueue;

public class 执行K次操作后的最大分数 {
    public long maxKelements(int[] nums, int k) {
        long ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for (int num : nums) {
            pq.offer(num);
        }
        while (k > 0){
            int x = pq.poll();
            ans += x;
            int next = (x + 2) / 3;
            pq.offer(next);
            k--;
        }
        return ans;
    }
}
