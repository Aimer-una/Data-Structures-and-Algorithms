package 灵茶山艾府.双指针滑动窗口.滑动窗口;

import java.util.Arrays;

public class 半径为k的子数组平均值 {
    public static void main(String[] args) {
        int[]nums = {7,4,3,9,1,8,5,2,6};
        System.out.println(Arrays.toString(getAverages(nums, 3)));
    }
    public static int[] getAverages(int[] nums, int k) {
        long sum = 0;
        int[] result = new int[nums.length];
        Arrays.fill(result,-1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i < k*2){
                continue;
            }
            result[i-k] = (int) (sum/(k*2+1));
            sum -= nums[i-k*2];
        }
        return result;
    }
}
