package 灵茶山艾府.双指针滑动窗口.滑动窗口;

public class 定长子串中元音的最大数目 {
    public int maxVowels(String s, int k) {
        int ans = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                sum++;
            }
            int left = i-k+1; // 更新窗口位置
            if (left < 0){
                continue; // 如果还没有形成窗口k就跳到下一层循环。直到形成窗口
            }
            // 2. 更新答案
            ans = Math.max(ans,sum);

            // 3. 左端点离开窗口，为下一个循环做准备
            char out = s.charAt(left);
            if (out == 'a' || out == 'e' || out == 'i' || out == 'o' || out == 'u'){
                sum--;
            }
        }
        return ans;
    }

    // 定滑模板
    public int fixedWindowTemplate(String S, int k) {
        char[] s = S.toCharArray();
        int ans = 0;
        int windowState = 0; // 本题是元音个数

        for (int right = 0; right < s.length; right++) {
            // 1️⃣ 右端点进入窗口，更新状态
            if (isTarget(s[right])) {
                windowState++;
            }

            int left = right - k + 1; // 计算当前窗口左边界
            if (left < 0) {
                continue; // 窗口还没满，跳过
            }

            // 2️⃣ 窗口已满，更新答案
            ans = Math.max(ans, windowState);

            // 3️⃣ 左端点离开窗口（为下一次循环准备）
            if (isTarget(s[left])) {
                windowState--;
            }
        }
        return ans;
    }
    public boolean isTarget(Object c){
        return true;
    }
}
