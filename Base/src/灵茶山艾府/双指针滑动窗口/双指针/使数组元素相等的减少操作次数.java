package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.Arrays;

public class 使数组元素相等的减少操作次数 {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int k = 0;
        int ans = 0;
        int n = nums.length;
        while (i < n){
            int start = i;
            while (i < n && nums[i] == nums[start]){
                i++;
            }
            // 当前组有 (i - start) 个数，每个需要 k 次操作
            ans += (i-start) * k;
            k++;
        }
        return ans;
    }
}
