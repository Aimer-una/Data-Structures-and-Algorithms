package 灵茶山艾府.数据结构.堆;

import java.util.PriorityQueue;

public class 移除石子使总数最小 {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        for (int pile : piles) {
            pq.offer(pile);
        }
        while (k > 0){
            Integer x = pq.poll();
            pq.offer((x + 1) / 2);
            k--;
        }
        int ans = 0;
        for (Integer num : pq) {
            ans += num;
        }
        return ans;
    }
}
