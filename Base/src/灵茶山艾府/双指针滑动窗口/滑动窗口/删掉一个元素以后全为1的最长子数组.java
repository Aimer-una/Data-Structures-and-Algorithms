package 灵茶山艾府.双指针滑动窗口.滑动窗口;

public class 删掉一个元素以后全为1的最长子数组 {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int result = 0;
        int cnt0 = 0;
        for (int right = 0; right < nums.length; right++) {
            cnt0 += 1 - nums[right];
            while (cnt0 > 1){
                cnt0 -= 1 - nums[left];
                left++;
            }
            // 至少要减去一个
            result = Math.max(result,right-left);
        }
        return result;
    }
}
