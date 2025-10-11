package 灵茶山艾府.双指针滑动窗口.滑动窗口;

public class 得到K个黑块的最少涂色次数 {
    public static void main(String[] args) {
        System.out.println(minimumRecolors("WBWW", 2));
    }
    public static int minimumRecolors(String blocks, int k) {
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < blocks.length(); i++) {
            char c = blocks.charAt(i);
            if (c == 'W'){
                sum++;
            }
            int left = i-k+1;
            if (left < 0 ){
                continue;
            }
            result = Math.min(result,sum);
            if (blocks.charAt(left) == 'W'){
                sum--;
            }
        }
        return  result;
    }
}
