package 灵茶山艾府.数据结构.队列;

import java.util.ArrayDeque;
import java.util.Deque;

public class 滑动窗口最大值 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && nums[deque.getLast()] <= nums[i]){
                deque.removeLast();
            }
            deque.add(i);
            int left = i - k + 1;
            if (deque.getFirst() < left){
                deque.removeFirst();
            }
            // 在窗口左端点处记录答案
            if (left >= 0){
                ans[left] = nums[deque.getFirst()];
            }
        }
        return ans;
    }
}
