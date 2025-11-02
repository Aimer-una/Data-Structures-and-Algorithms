package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.ArrayList;
import java.util.List;

public class 计数二进制子串 {
    public int countBinarySubstrings(String s) {
        int i = 0;
        int n = s.length();
        char[] chars = s.toCharArray();
        List<Integer> groups = new ArrayList<>();
        while (i < n){
            int start = i;
            i++;
            while (i < n && chars[i] == chars[i-1]){
                i++;
            }
            groups.add(i-start);
        }
        int ans = 0;
        for (int j = 1; j < groups.size(); j++) {
            ans += Math.min(groups.get(j),groups.get(j-1));
        }
        return ans;
    }
}
