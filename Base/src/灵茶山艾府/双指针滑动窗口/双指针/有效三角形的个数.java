package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.Arrays;

public class 有效三角形的个数 {
    public  int triangleNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 2; i < n; i++) {
            int right = i - 1;
            int left = 0;
            while (left < right){
                if (nums[left] + nums[right] > nums[i]){
                    ans += right - left;
                    right--;
                }else {
                    left++;
                }
            }
        }
        return ans;
    }
}
