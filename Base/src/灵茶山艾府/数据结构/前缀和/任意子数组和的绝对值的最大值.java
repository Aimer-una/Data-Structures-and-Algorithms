package 灵茶山艾府.数据结构.前缀和;

public class 任意子数组和的绝对值的最大值 {
    public int maxAbsoluteSum(int[] nums) {
        // 最大的数减去最小的数则是最大值
        int s = 0;
        int max = 0;
        int min = 0;
        for (int num : nums) {
            s += num;
            if (s > max){
                max = s;
            }else if (s < min){
                min = s;
            }
        }
        return max - min;
    }
}
