package 灵茶山艾府.数据结构.零常用枚举技巧;

public class 有序三元组中的最大值II {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        // 获取后缀的最大值
        int[] sufMax = new int[n + 1];
        // 后缀的最大值数 至少 不能是 0 1 索引 不然 i 和 j 就没位置了
        for (int i = n - 1; i > 1 ; i--) {
            sufMax[i] = Math.max(sufMax[i+1],nums[i]);
        }
        long ans = 0;
        // j 至少是 索引1 和 n - 1 不然就没有i 和 k 的位置了
        int preMax = nums[0];
        for (int j = 1; j < n - 1; j++) {
            ans = Math.max(ans,(long) (preMax - nums[j]) * sufMax[j+1]);
            // 替换i的最大值
           preMax = Math.max(preMax,nums[j]);
        }
        return ans;
    }

    // 相当于卖卖股票问题
    public long maximumTripletValue1(int[] nums) {
        int preMax = 0;
        int diffMax = 0;
        long ans = 0;
        for (int x : nums) {
            ans = Math.max(ans,(long) diffMax * x);
            diffMax = Math.max(diffMax,preMax - x);
            preMax = Math.max(preMax,x);
        }
        return ans;
    }
}
