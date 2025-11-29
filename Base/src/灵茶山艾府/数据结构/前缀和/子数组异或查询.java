package 灵茶山艾府.数据结构.前缀和;

public class 子数组异或查询 {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] s = new int[n+1];
        int[] ans = new int[queries.length];
        for (int i = 0; i < n; i++) {
            s[i+1] = arr[i] ^ s[i];
        }
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int left = query[0];
            int right = query[1];
            ans[i] = s[right + 1] ^ s[left];
        }
        return ans;
    }
}
