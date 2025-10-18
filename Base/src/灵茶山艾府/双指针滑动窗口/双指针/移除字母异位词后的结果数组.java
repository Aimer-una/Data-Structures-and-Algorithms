package 灵茶山艾府.双指针滑动窗口.双指针;


import java.util.Arrays;
import java.util.List;

public class 移除字母异位词后的结果数组 {
    public List<String> removeAnagrams(String[] words) {
        char[] base = words[0].toCharArray();
        Arrays.sort(base);
        int k = 1;
        for (int i = 1; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            Arrays.sort(chars);
            if (!Arrays.equals(chars,base)){
                base = chars;
                words[k++] = words[i];
            }
        }
        return Arrays.asList(Arrays.copyOf(words,k));
    }
}
