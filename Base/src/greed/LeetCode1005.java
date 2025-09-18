package greed;

import java.util.Arrays;
// 1005. K 次取反后最大化的数组和
public class LeetCode1005 {
    public static void main(String[] args) {
        int [] num = {4,2,3};
        System.out.println(largestSumAfterKNegations(num, 1));
    }
    public static int largestSumAfterKNegations(int[] nums, int k) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // 先把负数变成正数
            if (nums[i] < 0 && k > 0){
                nums[i] = -nums[i];
                k--;
            }
        }

        // 如果是奇数只需要改变最小的那个，如果是偶数都不用改变，因为偶数次不管怎么样都是原来的那个数
        if (k % 2 == 1){
            Arrays.sort(nums);
            nums[0] = -nums[0];
        }
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
