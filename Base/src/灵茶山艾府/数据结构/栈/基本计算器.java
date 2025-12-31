package 灵茶山艾府.数据结构.栈;

import java.util.ArrayDeque;
import java.util.Deque;

public class 基本计算器 {
        public int calculate(String s) {
            // 存放所有数据
            Deque<Integer> nums = new ArrayDeque<>();
            // 防止第一个数是负数
            nums.addLast(0);
            // 将所有空格去掉
            s = s.replaceAll(" ","");
            // 存放所有的操作
            Deque<Character> ops = new ArrayDeque<>();
            int n = s.length();
            char[] cs = s.toCharArray();
            for (int i = 0; i < n; i++) {
                char c = cs[i];
                if (c == '('){
                    ops.add(c);
                }else if (c == ')'){
                    // 计算到最近一个左括号为止
                    while (!ops.isEmpty()){
                        Character op = ops.peekLast();
                        if (op != '('){
                            calc(nums,ops);
                        }else {
                            ops.pollLast();
                            break;
                        }
                    }
                }else {
                    if (isNum(c)){
                        int u = 0;
                        int j = i;
                        // 将从 i 位置开始后面的连续数字整体取出，加入 nums
                        while (j < n && isNum(cs[j])){
                            u = u * 10 + (cs[j++] - '0');
                        }
                        nums.addLast(u);
                        i = j - 1;
                    }else {
                        if (i > 0 && (cs[i - 1] == '(' || cs[i - 1] == '+' || cs[i - 1] == '-')){
                            nums.add(0);
                        }
                        // 有一个新操作要入栈时，先把栈内可以算的都算了
                        while (!ops.isEmpty() && ops.peekLast() != '('){
                            calc(nums,ops);
                        }
                        ops.add(c);
                    }
                }
            }
            while (!ops.isEmpty()){
                calc(nums,ops);
            }
            return nums.peekLast();
        }

        void calc(Deque<Integer> nums, Deque<Character> ops){
            if (nums.isEmpty() || nums.size() < 2){
                return;
            }
            if (ops.isEmpty()){
                return;
            }
            int b = nums.pollLast();
            int a = nums.pollLast();
            Character op = ops.pollLast();
            nums.add(op == '+' ? a + b : a - b);
        }

        boolean isNum(char c){
            return Character.isDigit(c);
        }
}
