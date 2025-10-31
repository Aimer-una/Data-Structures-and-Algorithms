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

    public String makeFancyString1(String s) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum++;
            if (sum < 3){
                sb.append(s.charAt(i));
            }
            if (i < s.length() - 1 && s.charAt(i) != s.charAt(i+1)){
                sum = 0;
            }
        }
        return sb.toString();
    }
}
