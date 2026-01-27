package 灵茶山艾府.数据结构.堆;

import java.util.PriorityQueue;

public class 移山所需的最少秒数 {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        PriorityQueue<long[]> pq = new PriorityQueue<>((a,b) -> Long.compare(a[0],b[0]));
        for (int workerTime : workerTimes) {
            pq.offer(new long[]{workerTime,workerTime,workerTime});
        }
        long ans = 0;
        while (mountainHeight-- > 0){
            long[] w = pq.poll();
            /*
             * nextTime：这个工人下一次开始工作的时间
             * delta：这次工作将花费的时间（即降 1 单位高度所需时间）
             * base：这个工人的基础工作时间（不变）
             *
             * 比如这个工作的基本工作时间是1s
             * 那它下一次工作时间nxt变成3秒，base变成2秒以此类推工作次数越多所用的时间越久
             */
            long nxt = w[0],delta = w[1],base = w[2];
            ans = nxt;
            pq.offer(new long[]{nxt+delta+base,delta+base,base});
        }
        return ans;
    }
}
