package 灵茶山艾府.数据结构.栈;

import java.util.Deque;
import java.util.LinkedList;

public class 移除无效的括号 {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> stack = new LinkedList<>();
        boolean[] invalidIndex = new boolean[s.length()];
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '('){
                stack.push(i);
                invalidIndex[i] = true;
            }
            if (chars[i] == ')'){
                if (stack.isEmpty()){
                    invalidIndex[i] = true;
                }else {
                    invalidIndex[stack.pop()] = false;
                }
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (!invalidIndex[i]){
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
