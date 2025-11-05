package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.ArrayList;
import java.util.List;

public class 最长相邻不相等子序列I {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<>();
        int i = 0;
        int n = groups.length;
        while (i < n){
            int start = i;
            i++;
            while (i < n && groups[i] == groups[i-1]){
                i++;
            }
            result.add(words[start]);
        }
        return result;
    }
}
