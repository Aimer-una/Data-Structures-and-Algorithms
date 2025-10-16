package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.Arrays;

public class 最接近的三数之和 {
    public int threeSumClosest(int[] nums, int target) {
        // 初始话
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(ans - target)){
                    ans = sum;
                }
                if (sum < target){
                    left++;
                }else if (sum > target){
                    right--;
                }else {
                    return sum;
                }
            }
        }
        return ans;
    }
}
