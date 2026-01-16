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
}
