package 灵茶山艾府.双指针滑动窗口.滑动窗口;

public class 尽可能使字符串相等 {
    public int equalSubstring(String s, String t, int maxCost) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        int left = 0;
        int result = 0;
        int num = 0;
        for (int right = 0; right < s.length(); right++) {
            num += Math.abs(sc[right] - tc[right]);
            while (num > maxCost){
                num -= Math.abs(sc[left] - tc[left]);
                left++;
            }
            result = Math.max(result,right-left+1);
        }
        return result;
    }
}
