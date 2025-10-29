package 灵茶山艾府.双指针滑动窗口.双指针;

public class 连续字符 {
    public int maxPower(String s) {
        char[] chars = s.toCharArray();
        int n = s.length();
        int i = 0;
        int ans = 0;
        while (i < n){
            int start = i;
            i++;
            while (i < n && chars[i] == chars[i-1]){
                i++;
            }
            ans = Math.max(ans,i-start);
        }
        return ans;
    }
}
