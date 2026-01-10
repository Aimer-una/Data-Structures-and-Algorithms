package 每日一题;

public class 两个字符串的最小ASCII删除和 {
    public int minimumDeleteSum(String s1, String s2) {
        int total = s1.chars().sum() + s2.chars().sum();

        char[] s = s1.toCharArray();
        char[] t = s2.toCharArray();
        int n = s.length;
        int m = t.length;

        int[][] f = new int[n+1][m+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (s[i] == t[j]){
                    f[i+1][j+1] = f[i][j] + s[i];
                }else {
                    f[i+1][j+1] = Math.max(f[i][j+1],f[i+1][j]);
                }
            }
        }
        return total - f[n][m] * 2;
    }
}
