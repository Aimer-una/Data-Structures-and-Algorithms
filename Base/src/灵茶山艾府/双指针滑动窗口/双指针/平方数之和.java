package 灵茶山艾府.双指针滑动窗口.双指针;

public class 平方数之和 {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int) Math.sqrt(c);
        while (left <= right){
            if (left * left < c - right*right){
                left++;
            }else if (left * left > c - right*right){
                right--;
            }else {
                return true;
            }
        }
        return false;
    }
}
