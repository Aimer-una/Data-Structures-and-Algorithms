package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 至多K个不同元素的最大和 {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int[] array = new int[set.size()];
        int index = 0;
        for (Integer i : set) {
            array[index++] = i;
        }
        Arrays.sort(array); // 👈 关键！排序！
        // 3. 确定实际要取多少个
        int actualK = Math.min(k, array.length);
        int[] ans = new int[actualK];

        for (int i = 0; i < actualK; i++) {
            ans[i] = array[array.length - 1 -i ];

        }
        return ans;
    }
}
