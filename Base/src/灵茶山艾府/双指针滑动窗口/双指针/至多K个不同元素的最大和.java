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

    public int[] maxKDistinct1(int[] nums, int k) {
        Arrays.sort(nums);
        int actualK = removeDuplicates(nums);
        int min = Math.min(actualK, k);
        int[] ans = new int[min];
        for (int i = 0; i < min; i++) {
            ans[i] = nums[actualK - 1 - i];
        }
        return ans;
    }

    // 去重
    private int removeDuplicates(int[] nums){
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]){
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
