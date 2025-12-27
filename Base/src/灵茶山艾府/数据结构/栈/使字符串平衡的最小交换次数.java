package 灵茶山艾府.数据结构.栈;
//
public class 使字符串平衡的最小交换次数 {
    public int minSwaps(String s) {
        char[] chars = s.toCharArray();
        int j = chars.length - 1;
        int ans = 0;
        int c = 0;
        for (char b : chars) {
            if (b == '['){
                c++;
            }else if (c > 0){
                c--;
            }else {
                while (chars[j] == ']'){
                    j--;
                }
                chars[j] = ']';
                ans++;
                c++;
            }
        }
        return ans;
    }
}
