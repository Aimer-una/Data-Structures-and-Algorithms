package 灵茶山艾府.双指针滑动窗口.双指针;

public class 情感丰富的文字 {
    public int expressiveWords(String s, String[] words) {
        int ans = 0;
        for (String word : words) {
            boolean flag = expend(s, word);
            if (flag){
                ans++;
            }
        }
        return ans;
    }

    private boolean expend(String s, String t){
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()){
            if (s.charAt(i) != t.charAt(j)){
                return false;
            }
            char c = s.charAt(i);
            int cnti = 0;
            while (i < s.length() && s.charAt(i) == c){
                i++;
                cnti++;
            }
            int cntj = 0;
            while (j < t.length() && t.charAt(j) == c){
                j++;
                cntj++;
            }

            if (cnti < cntj){
                return false;
            }
            if (cnti != cntj && cnti < 3){
                return false;
            }
        }
        return i == s.length() && j == t.length();
    }
}
