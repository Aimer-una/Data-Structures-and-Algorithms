package hot100;

import java.util.*;

public class 字母异位词分组 {
    // 方法一
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!ans.containsKey(key)){
                ans.put(key,new ArrayList<>());
            }
            ans.get(key).add(str);
        }
        return new ArrayList(ans.values());
    }

    // 方法二
    public List<List<String>> groupAnagramsMethod2(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        int[] count = new int[26];
        for (String str : strs) {
            Arrays.fill(count,0);
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append("#");
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }

}
