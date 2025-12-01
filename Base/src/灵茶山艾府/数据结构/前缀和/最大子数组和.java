package 灵茶山艾府.数据结构.前缀和;

public class 最大子数组和 {
    // 写法一
    public int maxSubArray(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int ans = Integer.MIN_VALUE;
        int s = 0;
        for (int num : nums) {
            s += num;
            if (s > ans){
                ans = s;
            }
            if(s < 0){
                s = 0;
            }
        }
        return ans;
    }

    // 写法二
    public int maxSubArray1(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int minPreSum = 0;
        int preSum = 0;
        for (int num : nums) {
            preSum += num; // 当前的前缀和
            ans = Math.max(preSum - minPreSum,ans); // 减去前缀和的最小值
            if (preSum < minPreSum){
                minPreSum = preSum; // 维护前缀和的最小值
            }
        }
        return ans;
    }
}
