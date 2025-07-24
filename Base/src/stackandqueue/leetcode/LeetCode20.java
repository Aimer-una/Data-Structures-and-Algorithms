package stackandqueue.leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode20 {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        char[] charArray = s.toCharArray();
        if (charArray.length % 2 == 1){
            return false;
        }
        for (char c : charArray) {
            if (c == '('){
                stack.push(')');
            }else if (c == '{'){
                stack.push('}');
            }else if (c == '['){
                stack.push(']');
            }else {
                if(stack.isEmpty() || c != stack.peek()){
                    return false;
                }else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
