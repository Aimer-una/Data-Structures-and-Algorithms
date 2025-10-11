package 灵茶山艾府.双指针滑动窗口;

public class 和相同的二元子数组 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal) - atMost(nums,goal-1);
    }
    private int atMost(int[] nums, int target) {
        if (target < 0){
            return 0;
        }
        int left = 0;
        int ans = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            while (sum > target){
                sum -= nums[left];
                left++;
            }
            ans += i-left+1;
        }
        return ans;
    }
}
