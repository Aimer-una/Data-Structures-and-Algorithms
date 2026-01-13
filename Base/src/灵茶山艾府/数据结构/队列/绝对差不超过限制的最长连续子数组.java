package 灵茶山艾府.数据结构.队列;

import java.util.ArrayDeque;
import java.util.Deque;

public class 绝对差不超过限制的最长连续子数组 {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> minDeque = new ArrayDeque<>();
        Deque<Integer> maxDeque = new ArrayDeque<>();
        int ans = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            // 最小值入
            while (!minDeque.isEmpty() && x <= nums[minDeque.getLast()]){
                minDeque.removeLast();
            }
            minDeque.addLast(i);

            // 最大值入
            while (!maxDeque.isEmpty() && x >= nums[maxDeque.getLast()]){
                maxDeque.removeLast();
            }
            maxDeque.addLast(i);

            // 出
            while (nums[maxDeque.getFirst()] - nums[minDeque.getFirst()] > limit){
                left++;
                if (maxDeque.getFirst() < left){
                    maxDeque.removeFirst();
                }
                if (minDeque.getFirst() < left){
                    minDeque.removeFirst();
                }
            }
            ans = Math.max(ans,i-left+1);
        }
        return ans;
    }
}
