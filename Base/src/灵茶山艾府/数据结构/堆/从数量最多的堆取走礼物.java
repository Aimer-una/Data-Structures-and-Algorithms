package 灵茶山艾府.数据结构.堆;

import java.util.PriorityQueue;

public class 从数量最多的堆取走礼物 {
    public long pickGifts(int[] gifts, int k) {
        long ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        for (int gift : gifts) {
            pq.offer(gift);
        }
        while (k > 0){
            k--;
            Integer x = pq.poll();
            pq.offer((int) Math.sqrt(x));
        }
        for (Integer x : pq) {
            ans += x;
        }
        return ans;
    }
}
