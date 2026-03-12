package hot100;

import java.util.ArrayDeque;
import java.util.Deque;

public class 滑动窗口最大值 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1]; // 窗口个数
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && nums[deque.getLast()] <= nums[i]){
                deque.removeLast();
            }
            deque.addLast(i);
            // 左边出
            int left = i - k + 1;
            if (deque.getFirst() < left){
                deque.removeFirst();
            }
            if (left >= 0){
                // 由于队首到队尾单调递减，所以窗口最大值就在队首
                ans[left] = nums[deque.getFirst()];
            }
        }
        return ans;
    }
}
