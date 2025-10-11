package 灵茶山艾府.双指针滑动窗口.滑动窗口;

import java.util.HashMap;
import java.util.Map;

public class 无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()){
            return 0;
        }
        int left = 0;
        int ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 如果 c 已经在当前窗口中出现过（注意：要 >= left）
            if (map.containsKey(c) && map.get(c) >= left){
                left = map.get(c) + 1; // 跳过重复字符
            }
            map.put(c,i); // 更新 c 的最新位置
            ans = Math.max(ans,i - left + 1);
        }
        return ans;
    }

    public int lengthOfLongestSubstring1(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int ans = 0;
        int [] arr = new int[128];
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            arr[c]++;
            while (arr[c] > 1){
                arr[charArray[left]]--;
                left++;
            }
            ans = Math.max(ans,i-left+1);
        }
        return ans;
    }
}
