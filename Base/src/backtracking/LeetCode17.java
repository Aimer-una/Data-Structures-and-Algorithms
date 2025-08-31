package backtracking;

import java.util.ArrayList;
import java.util.List;
 // 17. 电话号码的字母组合
public class LeetCode17 {
    List<String> list = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()){
            return list;
        }
        //初始对应所有的数字，为了直接对应2-9，新增了两个无效的字符串""
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backTracking(digits,numString,0);
        return list;
    }
    
    StringBuilder sb = new StringBuilder();
    //比如digits如果为"23",num 为0，则str表示2对应的 abc
    public void backTracking(String digits, String[] numString, int num) {
        if (digits.length() == num){
            list.add(sb.toString());
            return;
        }
        String str = numString[digits.charAt(num) - '0'];
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            // 递归
            backTracking(digits,numString,num+1);
            // 回溯
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
