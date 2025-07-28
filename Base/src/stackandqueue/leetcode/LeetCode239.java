package stackandqueue.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode239 {
    class MyQueue{
        Deque<Integer> deque = new LinkedList<>();
        // 弹出元素时，比较当前要弹出的数值是否等于队列出口的数值，如果相等则弹出
        // 同时判断队列当前是否为空
        void poll(int val){
            if (!deque.isEmpty() && deque.peek() == val){
                deque.poll();
            }
        }

        // 添加元素时，如果要添加的元素大于入口处的元素，就将入口元素弹出
        // 保证队列元素单调递减
        // 比如此时队列元素3,1，2将要入队，比1大，所以1弹出，此时队列：3,2
        void add(int val){
            while (!deque.isEmpty() && val > deque.getLast()){
                deque.removeLast();
            }
            deque.add(val);
        }

        //队列队顶元素始终为最大值
        int peek() {
            if (!deque.isEmpty()){
                return deque.peek();
            }
           return 0;
        }

    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 1){
            return nums;
        }
        int len = nums.length - k + 1;
        // 存放结果元素的数组
        int[]res = new int[len];
        int num = 0;
        MyQueue myQueue = new MyQueue();

        // 初始化窗口（前k个元素）
        for (int i = 0; i < k; i++) {
            myQueue.add(nums[i]);
        }
        res[num++] = myQueue.peek();

        for (int i = k; i < nums.length; i++) {
            // 移除最左边的元素
            myQueue.poll(nums[i-k]);
            // 添加窗口最右边的新元素
            myQueue.add(nums[i]);
            // 记录当前窗口的最大值
            res[num++] = myQueue.peek();
        }
        return res;
    }
}
