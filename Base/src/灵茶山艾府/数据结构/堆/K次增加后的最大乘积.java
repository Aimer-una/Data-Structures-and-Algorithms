package 灵茶山艾府.数据结构.堆;

import java.util.PriorityQueue;

public class K次增加后的最大乘积 {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer(num);
        }
        while (k > 0){
            int x = pq.poll() + 1;
            pq.offer(x);
            k--;
        }
        long ans = 1;
        for (Integer num : pq) {
            ans = (ans*num) % 1000000007;
        }
        return (int)ans;
    }
}
