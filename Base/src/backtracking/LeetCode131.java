package backtracking;

import java.util.ArrayList;
import java.util.List;
// 131. 分割回文串
public class LeetCode131 {
    List<List<String>> result = new ArrayList<>();
    List<String> path = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtracking(s,0);
        return result;
    }

    public void backtracking(String s, int startIndex){
        if (startIndex >= s.length()){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            // 判断该字符串是否是回文字符串
            if (isPalindrome(s,startIndex,i)){
                // 切割字符串
                String substring = s.substring(startIndex, i + 1);
                path.add(substring);
                // 递归：从 i+1 位置开始下一轮分割
                backtracking(s,i+1);
                path.remove(path.size() - 1);
            }
            // 如果不是回文，直接跳过，不进入递归
        }
    }

    public boolean isPalindrome(String s, int left, int right){
        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
