package 灵茶山艾府.双指针滑动窗口.双指针;

public class 最长奇偶子数组 {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int n = nums.length;
        int i = 0;
        int ans = 0;
        while (i < n){
            // 必须是偶数开头
            if (nums[i] > threshold || nums[i] % 2 != 0){
                i++;
                continue;
            }
            int start = i;
            i++;
            while (i < n && nums[i] <= threshold && nums[i] % 2 != nums[i-1] % 2){
                i++;
            }
            ans = Math.max(ans,i - start);
        }
        return ans;
    }
}
