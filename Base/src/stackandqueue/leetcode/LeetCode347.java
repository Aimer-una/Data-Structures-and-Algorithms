package stackandqueue.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LeetCode347 {
    // 基于小顶堆实现
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //在优先队列中存储二元组(num, cnt),cnt表示元素值num在数组中的出现次数
        //出现次数按从队头到队尾的顺序是从小到大排,出现次数最低的在队头(相当于小顶堆)
        PriorityQueue<int[]>pq = new PriorityQueue<>((pair1,pair2)->pair1[1]-pair2[1]);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (pq.size() < k){ //小顶堆元素个数小于k个时直接加
                pq.add(new int[]{entry.getKey(),entry.getValue()});
            }else {
                //当前元素出现次数大于小顶堆的根结点(这k个元素中出现次数最少的那个)
                if (entry.getValue() > pq.peek()[1]){
                    //弹出队头(小顶堆的根结点),即把堆里出现次数最少的那个删除,留下的就是出现次数多的了
                    pq.poll();
                    pq.add(new int[]{entry.getKey(),entry.getValue()});
                }
            }
        }
        int[]ans = new int[k];
        //依次弹出小顶堆,先弹出的是堆的根,出现次数少,后面弹出的出现次数多
        for (int i=k-1; i>=0; i--){
            ans[i] = pq.poll()[0];
        }
        return ans;
    }
}
