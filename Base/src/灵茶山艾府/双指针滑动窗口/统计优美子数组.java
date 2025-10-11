package 灵茶山艾府.双指针滑动窗口;


public class 统计优美子数组 {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums,k) - atMost(nums,k-1);
    }

    private int atMost(int[] nums, int target) {
        if (target < 0){
            return 0;
        }
        int left = 0;
        int ans = 0;
        int oddCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (x % 2 == 1){
                oddCount++;
            }
            while (oddCount > target){
                if (nums[left] % 2 == 1){
                    oddCount--;
                }
                left++;
            }
            ans += i-left+1;
        }
        return ans;
    }
}
