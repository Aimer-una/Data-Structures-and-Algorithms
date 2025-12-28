package 灵茶山艾府.数据结构.栈;

import java.util.Deque;
import java.util.LinkedList;

public class 有效的括号字符串 {
    public boolean checkValidString(String s) {
        Deque<Integer> leftStack = new LinkedList<>();
        Deque<Integer> starStack = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '('){
                leftStack.push(i);
            }else if (chars[i] == '*'){
                starStack.push(i);
            }else {
                if (!leftStack.isEmpty()){
                    leftStack.pop();
                }else if (!starStack.isEmpty()){
                    starStack.pop();
                }else {
                    return false;
                }
            }
        }
        while (!leftStack.isEmpty() && !starStack.isEmpty()){
            Integer left = leftStack.pop();
            Integer star = starStack.pop();
            if (left > star){
                return false;
            }
        }
        return leftStack.isEmpty();
    }
}
