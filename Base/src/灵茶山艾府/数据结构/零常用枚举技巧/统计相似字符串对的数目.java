package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.HashMap;
import java.util.Map;

public class 统计相似字符串对的数目 {
    public int similarPairs(String[] words) {
        Map<Integer,Integer> cnt = new HashMap<>();
        int ans = 0;
        for (String word : words) {
            // 初始化一个空的集合（所有位都是 0）
            int mask = 0;
            for (char c : word.toCharArray()) {
                // 把字母 c 加入集合
                mask |= 1 << (c - 'a');
            }
            ans += cnt.getOrDefault(mask,0);
            cnt.put(mask,cnt.getOrDefault(mask,0)+1);
        }
        return ans;
    }
}
