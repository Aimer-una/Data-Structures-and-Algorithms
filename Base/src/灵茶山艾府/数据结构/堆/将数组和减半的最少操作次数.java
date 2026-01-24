package 灵茶山艾府.数据结构.堆;

import java.util.PriorityQueue;

public class 将数组和减半的最少操作次数 {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>((a, b) -> b.compareTo(a));
        double sum = 0;
        for (int num : nums) {
            sum += num;
            pq.offer((double) num);
        }
        int ans = 0;
        double target = 0.0;
        while (target < sum / 2){
            double x = pq.poll();
            target += x/2;
            pq.offer(x/2);
            ans++;
        }
        return ans;
    }
}
