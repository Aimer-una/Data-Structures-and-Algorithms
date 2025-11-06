package 灵茶山艾府.双指针滑动窗口.双指针;

public class 最长交替子数组 {
    public int alternatingSubarray(int[] nums) {
        int i = 0;
        int n = nums.length;
        int ans = 0;
        while (i < n - 1){
            if (nums[i+1] - nums[i] != 1){
                i++;
                continue;
            }
            int start = i;
            i+=2;
            while (i < n && nums[i] == nums[i-2]){
                i++;
            }
            ans = Math.max(ans,i-start);
            i--;
        }
        return ans;
    }
}
