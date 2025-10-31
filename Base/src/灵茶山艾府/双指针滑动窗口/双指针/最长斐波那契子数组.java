package 灵茶山艾府.双指针滑动窗口.双指针;

public class 最长斐波那契子数组 {
    public int longestSubarray(int[] nums) {
        int ans = 2;
        int start = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[i-1] + nums[i-2]){
                ans = Math.max(ans,i-start);
                start = i - 1;
            }
        }
        return Math.max(ans,nums.length - start);
    }
}
