package 每日一题;

public class 加一 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0){
                return digits;
            }
        }
        // 如果循环结束都没返回，说明全是 9！
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
