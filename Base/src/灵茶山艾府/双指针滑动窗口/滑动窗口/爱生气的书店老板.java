package 灵茶山艾府.双指针滑动窗口.滑动窗口;

public class 爱生气的书店老板 {
    // 老板不生气时的顾客数量之和 s。这些顾客可以感到满意。
    // 长度为 minutes 的连续子数组中，老板生气时的顾客数量之和 s1的最大值 maxS。这些顾客可以感到满意。
    // 最终答案为s+maxS
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int[] array = new int[2];
        int max = 0;
        for (int i = 0; i < customers.length; i++) {
            array[grumpy[i]] += customers[i];
            int left = i-minutes+1;
            if (left < 0){
                continue;
            }
            max = Math.max(max,array[1]);
            if (grumpy[left] == 1){
                array[1] -= customers[left];
            }
        }
        return array[0] + max;
    }

}
