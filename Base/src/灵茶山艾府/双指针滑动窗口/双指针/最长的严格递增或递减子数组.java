package 灵茶山艾府.双指针滑动窗口.双指针;

public class 最长的严格递增或递减子数组 {
    public int longestMonotonicSubarray(int[] nums) {
        int i = 0;
        int n = nums.length;
        int ans = 1;
        while (i < n - 1){
            // 先找到开始位置
            if (nums[i+1] == nums[i]){
                i++;
                continue;
            }
            // 奠定是严格递增，还是严格递减
            int start = i;
            boolean inc = nums[i+1] > nums[i];
            i+=2; // i 和 i+1 已经满足要求，从 i+2 开始判断
            while (i < n && nums[i] != nums[i-1] && (nums[i] > nums[i-1]) == inc){
                i++;
            }
            ans = Math.max(ans,i-start);
            i--;
        }
        return ans;
    }
}
