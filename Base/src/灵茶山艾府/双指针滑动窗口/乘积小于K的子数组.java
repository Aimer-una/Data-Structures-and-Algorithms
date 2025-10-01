package 灵茶山艾府.双指针滑动窗口;

public class 乘积小于K的子数组 {
    public static void main(String[] args) {
        int [] nums = {10, 5, 2, 6};
        System.out.println(numSubarrayProductLessThanK(nums, 100));
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int n = nums.length;
        int left = 0;
        int prod = 1;
        int ans = 0;
        for (int right = 0; right < n; right++) {
            prod *= nums[right];
            while (prod >= k){
                prod /= nums[left];
                left ++;
            }
            ans += (right - left) + 1;
        }
        return ans;
    }
}
