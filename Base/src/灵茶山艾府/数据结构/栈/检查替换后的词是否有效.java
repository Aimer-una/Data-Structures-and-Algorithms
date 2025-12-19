package 灵茶山艾府.数据结构.栈;

public class 检查替换后的词是否有效 {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        for (char c : chars) {
            if (c > 'a' && (i == 0 || c - chars[--i] != 1)){
                return false;
            }
            if (c < 'c'){
                chars[i++] = c;
            }
        }
        return i == 0;
    }
}
