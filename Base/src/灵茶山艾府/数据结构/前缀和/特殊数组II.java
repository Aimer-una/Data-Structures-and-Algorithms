package 灵茶山艾府.数据结构.前缀和;

public class 特殊数组II {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] s = new int[n];
        boolean[] ans = new boolean[queries.length];
        for (int i = 1; i < n; i++) {
            s[i] = s[i-1] + (nums[i-1] % 2 == nums[i] % 2 ? 1 : 0);
        }
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int left = query[0];
            int right = query[1];
            ans[i] = s[right] - s[left] == 0;
        }
        return ans;
    }
}
