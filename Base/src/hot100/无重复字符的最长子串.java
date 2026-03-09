package hot100;

import java.util.HashMap;
import java.util.Map;

public class 无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        int left = 0;
        for (int right = 0; right < chars.length; right++) {
            map.put(chars[right],map.getOrDefault(chars[right],0)+1);
            while (map.get(chars[right]) > 1){
                map.put(chars[left],map.get(chars[left]) - 1);
                left++;
            }
            ans = Math.max(ans,right - left + 1);
        }
        return ans;
    }
}
