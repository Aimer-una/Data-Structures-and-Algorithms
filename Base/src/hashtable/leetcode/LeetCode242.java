package hashtable.leetcode;

public class LeetCode242 {
    public boolean isAnagram(String s, String t) {
        // 定义一个长度为26的数组
        int[]array = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            int index = charAt - 'a';
            array[index]++;
        }
        for (int i = 0; i < t.length(); i++) {
            char charAt = t.charAt(i);
            int index = charAt - 'a';
            array[index]--;
        }

        for (int count : array) {
            if (count != 0){
                return false;
            }
        }
        return true;
    }
}
