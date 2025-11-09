package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.Arrays;

public class 推多米诺 {
    public String pushDominoes(String dominoes) {
        char[] s = ("L" + dominoes + "R").toCharArray();
        int pre = 0;
        for (int i = 1; i < s.length; i++) {
            if (s[i] == '.'){
                continue;
            }
            if (s[i] == s[pre]){
                Arrays.fill(s,pre+1,i,s[i]);
            }else if (s[i] == 'L'){
                // 前一半变R
                Arrays.fill(s,pre+1,(pre+i+1)/2,'R');
                // 后一半变L
                Arrays.fill(s,(pre+i)/2+1,i,'L');
            }
            pre = i;
        }
        return new String(s,1,s.length-2);
    }
}
