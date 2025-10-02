package 灵茶山艾府.双指针滑动窗口;

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
                continue; // 如果还没有形成窗口k就跳到下一层循环。知道形成窗口
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
}
