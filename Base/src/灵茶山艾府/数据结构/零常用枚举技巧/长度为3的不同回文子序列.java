package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.HashMap;
import java.util.Map;

public class 长度为3的不同回文子序列 {
    public int countPalindromicSubsequence(String s) {
        int[] preCnt = new int[26];
        char[] chars = s.toCharArray();
        int n = chars.length;
        // 为什么从 1 开始？因为中间字符至少是索引 1（左边要有位置给首字母）
        for (int i = 1; i < n; i++) {
            preCnt[chars[i] - 'a']++;
        }
        int ans = 0;
        // 标记左边获取了那些字符
        boolean[] left = new boolean[26];
        // 标记已经加入的组合
        boolean[][] has = new boolean[26][26];
        for (int i = 1; i < n - 1; i++) {
            int mid = chars[i] - 'a';
            preCnt[mid]--;
            left[chars[i-1] - 'a'] = true;
            for (int alpha = 0; alpha < 26; alpha++) { // 枚举两侧字母 alpha
                // 判断 mid 的左右两侧是否都有字母 alpha
                if (left[alpha] && preCnt[alpha] > 0 && !has[mid][alpha]){
                    has[mid][alpha] = true;
                    ans++;
                }
            }
        }
        return ans;
    }
}
