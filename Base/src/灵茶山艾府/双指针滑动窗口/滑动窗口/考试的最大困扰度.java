package 灵茶山艾府.双指针滑动窗口.滑动窗口;

public class 考试的最大困扰度 {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int left = 0 , ans = 0, t = 0, f = 0;
        for (int i = 0; i < answerKey.length(); i++) {
            char c = answerKey.charAt(i);
            if (c == 'T'){
                t++;
            }else {
                f++;
            }
            while (Math.min(f,t) > k){
                char c1 = answerKey.charAt(left);
                if (c1 == 'T') {
                    t--;
                }else {
                    f--;
                }
                left++;
            }
            ans = Math.max(ans,i-left+1);
        }
        return ans;
    }
}
