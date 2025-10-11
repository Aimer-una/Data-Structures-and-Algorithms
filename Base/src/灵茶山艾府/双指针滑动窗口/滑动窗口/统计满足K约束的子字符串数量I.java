package 灵茶山艾府.双指针滑动窗口.滑动窗口;

public class 统计满足K约束的子字符串数量I {
    public int countKConstraintSubstrings(String s, int k) {
        int left = 0;
        int[] arr = new int[2];
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)- '0'] ++;
            while (arr[0] > k && arr[1] > k){
                arr[s.charAt(left) - '0']--;
                left++;
            }
            ans += i-left+1;
        }
        return ans;
    }
}
