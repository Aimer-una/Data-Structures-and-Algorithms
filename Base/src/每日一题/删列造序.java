package 每日一题;

public class 删列造序 {
    public int minDeletionSize(String[] strs) {
        int ans = 0;
        int m = strs.length; // 行
        int n = strs[0].length(); // 列
        for (int j = 0; j < n; j++) {
            for (int i = 1; i < m; i++) {
                if (strs[i].charAt(j) < strs[i-1].charAt(j)){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
