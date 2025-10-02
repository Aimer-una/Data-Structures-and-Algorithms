package 灵茶山艾府.双指针滑动窗口;

public class 子数组最大平均数I {
    public double findMaxAverage(int[] nums, int k) {
        double ans = Double.NEGATIVE_INFINITY;
        double ave = 0;
        for (int i = 0; i < nums.length; i++) {
            ave += nums[i];

            // 更新窗口位置
            int left = i-k+1;
            if (left < 0){
                // 如果没有形成窗口大小为k的窗口，就跳到下一层循环直到形成窗口
                continue;
            }
            // 计算结果
            ans = Math.max(ans,ave/k);

            // 3. 左端点离开窗口，为下一个循环做准备
            ave = ave - nums[left];
        }
        return ans;
    }
}
