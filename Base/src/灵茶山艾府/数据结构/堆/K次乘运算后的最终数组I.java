package 灵茶山艾府.数据结构.堆;

import java.util.PriorityQueue;

public class K次乘运算后的最终数组I {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int m = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[m]){
                    m = j;
                }
            }
            nums[m] *= multiplier;
        }
        return nums;
    }

    public int[] getFinalState1(int[] nums, int k, int multiplier) {
        // 这是一个“按值排序，值相同则按下标排序”的最小堆。
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> nums[a] != nums[b] ? nums[a] - nums[b] : a - b);
        for (int i = 0; i < nums.length; i++) {
            pq.offer(i);
        }
        while (k > 0){
            Integer idx = pq.poll();
            nums[idx] *= multiplier;
            pq.offer(idx);
            k--;
        }
        return nums;
    }
}
