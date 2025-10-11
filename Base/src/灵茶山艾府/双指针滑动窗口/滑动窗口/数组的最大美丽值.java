package 灵茶山艾府.双指针滑动窗口.滑动窗口;

import java.util.Arrays;

public class 数组的最大美丽值 {
    /**
     * 而判断一组区间是否有公共交集，一个经典技巧是：排序后，只需检查最左和最右的两个数是否能“覆盖”同一个点。
     * 考虑窗口 [left, right] 中的所有数。
     * 最小值是 nums[left]，它能到达的最大值是 nums[left] + k
     * 最大值是 nums[right]，它能到达的最小值是 nums[right] - k
     * 要让它们能变成同一个数，必须满足：nums[left] + k ≥ nums[right] - k
     * 移项得：nums[right] - nums[left] ≤ 2k
     */
    public int maximumBeauty(int[] nums, int k) {
        int left = 0;
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] - nums[left] > 2*k){
                left++;
            }
            ans = Math.max(ans,i-left+1);
        }
        return ans;
    }
}
