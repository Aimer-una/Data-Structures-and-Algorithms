package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 找到字符串中所有字母异位词 {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] cntP = new int[26];
        char[] charsP = p.toCharArray();
        for (char c : charsP) {
            cntP[c - 'a']++;
        }
        char[] chars = s.toCharArray();
        int[] cntS = new int[26];
        for (int right = 0; right < chars.length; right++) {
            int left = right - p.length() + 1;
            cntS[chars[right] - 'a']++;
            if (left < 0){
                continue;
            }
            if (Arrays.equals(cntS,cntP)) {
                ans.add(left);
            }
            cntS[chars[left] - 'a']--;

        }
        return ans;
    }
}
