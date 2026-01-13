package 灵茶山艾府.数据结构.队列;

import java.util.ArrayDeque;
import java.util.Deque;

public class 不间断子数组 {
    public long continuousSubarrays(int[] nums) {
        Deque<Integer> minDeque = new ArrayDeque<>();
        Deque<Integer> maxDeque = new ArrayDeque<>();
        long ans = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            while (!minDeque.isEmpty() && x <= nums[minDeque.getLast()]){
                minDeque.removeLast();
            }
            minDeque.add(i);
            while (!maxDeque.isEmpty() && x >= nums[maxDeque.getLast()]){
                maxDeque.removeLast();
            }
            maxDeque.add(i);

            while (nums[maxDeque.getFirst()] - nums[minDeque.getFirst()] > 2){
                left++;
                if (maxDeque.getFirst() < left){
                    maxDeque.removeFirst();
                }
                if (minDeque.getFirst() < left){
                    minDeque.removeFirst();
                }
            }
            ans += i-left+1;
        }
        return ans;
    }
}
