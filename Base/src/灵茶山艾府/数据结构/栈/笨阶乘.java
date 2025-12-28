package 灵茶山艾府.数据结构.栈;

import java.util.Deque;
import java.util.LinkedList;

public class 笨阶乘 {
    public int clumsy(int n) {
        Deque<Integer> stack = new LinkedList<>();
        stack.push(n);
        int index = 0;
        n--;
        while (n > 0){
            if (index % 4 == 0){
                stack.push(stack.pop() * n);
            }else if (index % 4 == 1){
                stack.push(stack.pop() / n);
            }else if (index % 4 == 2){
                stack.push(n);
            }else {
                stack.push(-n);
            }
            n--;
            index++;
        }
        int ans = 0;
        while (!stack.isEmpty()){
            ans += stack.pop();
        }
        return ans;
    }
}
