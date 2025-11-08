package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.Arrays;

public class 长度为K的子数组的能量值II {
    public int[] resultsArray(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        Arrays.fill(ans,-1);
        int ctn = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0){
                ctn = 1;
            }else if (nums[i] == nums[i-1] + 1){
                ctn++;
            }else {
                ctn = 1;
            }
            if (ctn >= k){
                ans[i-k+1] = nums[i];
            }
        }
        return ans;
    }
}
