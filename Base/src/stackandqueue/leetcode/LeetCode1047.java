package stackandqueue.leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class LeetCode1047 {
    public static void main(String[] args) {
        String s = removeDuplicates("abbaca");
        System.out.println(s);
    }

    public static String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else {
                stack.push(c);
            }
        }
/*        StringBuilder sb = new StringBuilder();
        //剩余的元素即为不重复的元素
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse.toString();*/
        String str = "";
        //剩余的元素即为不重复的元素
        while (!stack.isEmpty()) {
            str = stack.pop() + str;
        }
        return str;
    }
}
