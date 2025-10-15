package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.Arrays;
import java.util.List;

public class 统计和小于目标的下标对数目 {
    public int countPairs(List<Integer> nums, int target) {
        int left = 0;
        int right = nums.size() - 1;
        int ans = 0;
        int[] arr = new int[nums.size()];
        int index = 0;
        for (Integer num : nums) {
            arr[index] = num;
            index++;
        }
        Arrays.sort(arr);
        while (left < right) {
            if (arr[left] + arr[right] < target) {
                ans += right - left;
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}