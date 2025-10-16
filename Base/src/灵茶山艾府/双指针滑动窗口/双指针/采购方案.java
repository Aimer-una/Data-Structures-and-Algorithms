package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.Arrays;

public class 采购方案 {
    public int purchasePlans(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        long ans = 0;
        while (left < right){
            if (nums[left] + nums[right] <= target){
                ans += right - left ;
                left++;
            }else {
                right--;
            }
        }
        return (int) (ans % 1_000_000_007);
    }
}
