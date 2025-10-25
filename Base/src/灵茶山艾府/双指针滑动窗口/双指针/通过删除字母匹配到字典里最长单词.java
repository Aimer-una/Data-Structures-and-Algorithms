package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.List;

public class 通过删除字母匹配到字典里最长单词 {
    public String findLongestWord(String s, List<String> dictionary) {
        int ans = 0;
        String result = "";
        for (String string : dictionary) {
            int j = 0;
            int i = 0;
            while (i < s.length() && j < string.length()){
                if (s.charAt(i) == string.charAt(j)){
                    j++;
                }
                i++;
            }
            if (j == string.length()){
                // string.compareTo(result) < 0 判断更小字母序最小的方法
                if (j > ans || string.length() == result.length() && string.compareTo(result) < 0){
                    ans = j;
                    result = string;
                }
            }
        }
        return result;
    }
}
