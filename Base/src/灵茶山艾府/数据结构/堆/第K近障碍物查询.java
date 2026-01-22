package 灵茶山艾府.数据结构.堆;

import java.util.PriorityQueue;

public class 第K近障碍物查询 {
    public int[] resultsArray(int[][] queries, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            pq.offer(Math.abs(queries[i][0]) + Math.abs(queries[i][1]));
            if (pq.size() > k){
                pq.poll();
            }
            ans[i] = pq.size() == k ? pq.peek() : -1;
        }
        return ans;
    }
}
