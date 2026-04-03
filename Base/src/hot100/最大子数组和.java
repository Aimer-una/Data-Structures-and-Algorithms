package hot100;

public class 最大子数组和 {
    // 贪心算法
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for (int num : nums) {
            sum = Math.max(num,sum+num);
            max = Math.max(sum,max);
        }
        return max;
    }
}
