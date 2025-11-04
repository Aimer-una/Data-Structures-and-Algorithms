package 灵茶山艾府.双指针滑动窗口.双指针;

public class 如果相邻两个颜色均相同则删除当前颜色 {
    public boolean winnerOfGame(String colors) {
        int i = 0;
        int n = colors.length();
        char[] chars = colors.toCharArray();
        int ansA = 0;
        int ansB = 0;
        while (i < n - 1){
            char currentColor = chars[i];
            int start = i;
            i++;
            while (i < n && chars[i] == chars[i-1]){
                i++;
            }
            int len = i - start;
            if (len >= 3){
                if (currentColor == 'A'){
                    ansA += len - 2;
                }else {
                    ansB += len - 2;
                }
            }
        }
        return ansA > ansB;
    }
}
