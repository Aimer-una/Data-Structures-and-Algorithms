package 灵茶山艾府.双指针滑动窗口.双指针;

public class 最长特殊序列II {
    public int findLUSlength(String[] strs) {
        int ans = -1;
        next:
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() <= ans){
                continue;
            }
            for (int j = 0; j < strs.length; j++) {
                if (j != i && isValid(strs[i],strs[j])){
                    continue next;
                }
            }
            ans = strs[i].length();
        }
        return ans;
    }

    // 判断是否为子序列
    private boolean isValid(String t1,String t2){
        int i = 0;
        int j = 0;
        while (i < t1.length() && j < t2.length()){
            if (t1.charAt(i) == t2.charAt(j)){
                i++;
            }
            j++;
        }
        return i == t1.length();
    }
}
