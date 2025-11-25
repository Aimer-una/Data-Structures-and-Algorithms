package 灵茶山艾府.数据结构.零常用枚举技巧;

public class 元素和最小的山形三元组II {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int[] sufMin = new int[n];
        sufMin[n-1] = nums[n-1];
        for (int i = n - 2; i > 1; i--) {
            sufMin[i] = Math.min(sufMin[i+1],nums[i]);
        }
        int ans = Integer.MAX_VALUE;
        int preMin = nums[0];
        for (int j = 1; j < n - 1; j++) {
            if (preMin < nums[j] && nums[j] > sufMin[j+1]){
                ans = Math.min(ans,preMin + nums[j] + sufMin[j+1]);

            }
            preMin = Math.min(preMin,nums[j]);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}

