package greed;

import java.util.ArrayList;
import java.util.List;
// 763. 划分字母区间
public class LeetCode763 {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        int[] edge = new int[26];
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
           edge[charArray[i] - 'a'] = i;
        }
        int idx = 0;
        int last = -1;
        for (int i = 0; i < charArray.length; i++) {
            idx = Math.max(idx,edge[charArray[i] - 'a']);
            if (i == idx){
                result.add(idx - last);
                last = i;
            }
        }
        return result;
    }
}
