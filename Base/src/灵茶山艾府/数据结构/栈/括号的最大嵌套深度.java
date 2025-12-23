package 灵茶山艾府.数据结构.栈;

public class 括号的最大嵌套深度 {
    public int maxDepth(String s) {
        int ans = 0;
        int size = 0;
        for (char c : s.toCharArray()) {
            if (c == '('){
                size++;
                ans = Math.max(ans,size);
            }else if (c == ')'){
                size--;
            }
        }
        return ans;
    }
}
