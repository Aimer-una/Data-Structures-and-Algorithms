package 灵茶山艾府.数据结构.前缀和;

public class 变长子数组求和 {
    public int subarraySum(int[] nums) {
        int[] s = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            s[i+1] = nums[i] + s[i];
        }
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            // 计算题目起始位置
            int start = Math.max(i-nums[i],0);
            ans += s[i+1] - s[start];
        }
        return ans;
    }
}
