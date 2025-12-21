package 灵茶山艾府.数据结构.栈;

import java.util.Stack;

public class 删除字符串中的所有相邻重复项II {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < sb.length(); ++i) {
            if (i == 0 || sb.charAt(i) != sb.charAt(i-1)){
                stack.push(1);
            }else {
                int increment = stack.pop() + 1;
                if (increment == k){
                    sb.delete(i-k+1,i+1);
                    i = i - k;
                }else {
                    stack.push(increment);
                }
            }
        }
        return sb.toString();
    }
}
