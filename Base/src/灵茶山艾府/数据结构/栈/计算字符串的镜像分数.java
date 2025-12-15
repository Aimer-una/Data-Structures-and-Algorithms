package 灵茶山艾府.数据结构.栈;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class 计算字符串的镜像分数 {
    public long calculateScore(String s) {
        Deque<Integer>[] stk = new ArrayDeque[26];
        Arrays.setAll(stk,i -> new ArrayDeque<>());
        long ans = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int c = chars[i] - 'a';
            if (!stk[25 - c].isEmpty()){
                ans += i - stk[25-c].pop();
            }else {
                stk[c].push(i);
            }
        }
        return ans;
    }
}
