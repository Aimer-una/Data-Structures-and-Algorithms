package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.Arrays;

public class 判断一个数组是否可以变为有序 {
    public boolean canSortArray1(int[] nums) {
        int[] arr = nums.clone();
        int i = 0;
        int n = nums.length;
        while (i < n){
            int start = i;
            int pop = Integer.bitCount(arr[i]);
            i++;
            while (i < n && Integer.bitCount(arr[i]) == pop){
                i++;
            }
            // 组内可以任意重排 → 直接排序这段
            Arrays.sort(arr,start,i);
        }
        // 检查最终数组是否非递减
        for (int j = 1; j < n; j++) {
            if (arr[j] < arr[j-1]){
                return false;
            }
        }
        return true;
    }

    // 差7个用例AC
    public boolean canSortArray(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        for (int i = 0; i < nums.length; i++) {
            if (sorted[i] != nums[i]){
                // 如果值不同，检查它们的二进制 1 的个数是否相同
                if (Integer.bitCount(sorted[i]) != Integer.bitCount(nums[i])){
                    return false;
                }
            }
        }
        return true;
    }
}
