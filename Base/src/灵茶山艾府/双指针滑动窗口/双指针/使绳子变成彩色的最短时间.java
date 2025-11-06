package 灵茶山艾府.双指针滑动窗口.双指针;

public class 使绳子变成彩色的最短时间 {
    public int minCost(String colors, int[] neededTime) {
        int i = 0;
        int n = colors.length();
        int ans = 0;
        char[] chars = colors.toCharArray();
        while (i < n) {
            char c = chars[i];
            int sum = 0;
            int max = 0;
            while (i < n && chars[i] == c){
                sum += neededTime[i];
                max = Math.max(max,neededTime[i]);
                i++;
            }
            if (sum > max){
                ans += sum-max;
            }
        }
        return ans;
    }
}
