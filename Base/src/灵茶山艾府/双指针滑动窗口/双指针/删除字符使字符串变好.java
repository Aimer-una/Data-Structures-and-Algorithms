package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.Arrays;

public class 删除字符使字符串变好 {
    public String makeFancyString(String s) {
        int i = 0;
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        while (i < n){
            char c = s.charAt(i);
            int start = i;
            while (i < n && s.charAt(i) == c){
                i++;
            }
            // 这一段长度
            int len = i - start;
            // 最多保留两个
            int keep = Math.min(len, 2);
            for (int j = 0; j < keep; j++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
