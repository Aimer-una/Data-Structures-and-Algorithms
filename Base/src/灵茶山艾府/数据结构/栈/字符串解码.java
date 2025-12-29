package 灵茶山艾府.数据结构.栈;

import java.util.Deque;
import java.util.LinkedList;

public class 字符串解码 {
    public String decodeString(String s) {
        int multi = 0;
        StringBuilder res = new StringBuilder();
        Deque<Integer> multi_stack = new LinkedList<>();
        Deque<String> res_stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '['){
                res_stack.push(res.toString());
                multi_stack.push(multi);
                multi = 0;
                res = new StringBuilder();
            }else if (c == ']'){
                Integer cur_multi = multi_stack.pop();
                StringBuilder tmp = new StringBuilder();
                for (int i = 0; i < cur_multi; i++) {
                    tmp.append(res);
                }
                res = new StringBuilder(res_stack.pop() + tmp);
            }else if (c >= '0' && c <= '9'){
                // 拼接多位数，比如 "12" → multi = 1*10 + 2 = 12
                multi = multi * 10 + Integer.parseInt(c + "");
            }else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
