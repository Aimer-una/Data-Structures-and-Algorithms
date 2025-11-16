package 灵茶山艾府.数据结构.零常用枚举技巧;

public class 增量元素之间的最大差值 {
    public static void main(String[] args) {
        int i = maximumDifference(new int[]{9, 4, 3, 2});
        System.out.println(i);
    }
    public static int maximumDifference(int[] nums) {
        int min = nums[0];
        int ans = -1;
        for (int i = 1; i < nums.length ; i++) {
            ans = Math.max(ans,nums[i] - min);
            min = Math.min(min,nums[i]);
        }
        return ans > 0 ? ans : -1;
    }
}
