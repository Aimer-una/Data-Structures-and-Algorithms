package 灵茶山艾府.双指针滑动窗口;

public class 最短且字典序最小的美丽子字符串 {
    public String shortestBeautifulSubstring(String s, int k) {
        // 提前判断是否存在解
        if (s.replace("0","").length() < k){
            /*
             * 把所有 '0' 去掉，剩下的就是 '1' 的数量。
             * 如果 '1' 总数 < k，肯定无解，直接返回空串
             */
            return "";
        }
        int ctn1 = 0;
        char[] charArray = s.toCharArray();
        int left = 0;
        String ans = s;  // 初始答案设为整个字符串（一定合法，因为前面已判断有解）
        for (int right = 0; right < charArray.length; right++) {
            ctn1 += charArray[right] - '0'; // 相当于 if (s[right]=='1') cnt1++
            // 只要窗口中 '1' 超过 k，或者左端是 '0'，就收缩左边。
            while (ctn1 > k || charArray[left] == '0'){
                /*
                 * 为什么可以去掉左边的 '0'？
                 * 因为我们想找最短的子串。
                 * 如果当前窗口有 k 个 '1'，但开头是 '0'，比如 "00101"，那么去掉前面的 '0' 得到 "101"：
                 * '1' 数量不变（仍是 k），
                 * 长度更短，
                 * 字典序更小（因为去掉了前导 '0'）。
                 */
                ctn1 -= charArray[left] - '0';
                left++;
            }
            if (ctn1 == k){
                String t = s.substring(left,right+1);
                /*
                 * 只有当窗口恰好有 k 个 '1' 时才考虑。
                 * 比较规则：
                 * 优先长度短；
                 * 长度相同时，字典序小的胜出（compareTo < 0 表示 t 字典序更小）。
                 */
                if (t.length() < ans.length() || t.length() == ans.length() && t.compareTo(ans) < 0){
                    ans = t;
                }
            }
        }
        return ans;
    }
}
