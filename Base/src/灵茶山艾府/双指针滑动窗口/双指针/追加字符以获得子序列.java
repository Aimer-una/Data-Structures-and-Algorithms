package 灵茶山艾府.双指针滑动窗口.双指针;

public class 追加字符以获得子序列 {
    public int appendCharacters(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < t.length() && j < s.length()){
            if (t.charAt(i) == s.charAt(j)){
                i++;
            }
            j++;
        }
        return t.length() - i ;
    }
}
