package 灵茶山艾府.数据结构.前缀和;

public class 有序数组中差绝对值之和 {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] s = new int[n];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            s[i] = sum;
        }
        int[] ans = new int[n];
        for (int i = 0; i < nums.length; i++) {
            int left = (i+1)*nums[i] - s[i];
            int right = s[n-1] - s[i] - (n-1-i) * nums[i];
            ans[i] = left + right;
        }
        return ans;
    }
}
