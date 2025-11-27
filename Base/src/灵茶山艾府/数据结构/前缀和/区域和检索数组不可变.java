package 灵茶山艾府.数据结构.前缀和;

public class 区域和检索数组不可变 {
    private final int[] s;
    public 区域和检索数组不可变(int[] nums) {
        s = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            s[i+1] = nums[i] + s[i];
        }
    }

    public int sumRange(int left, int right) {
        return s[right + 1] - s[left];
    }
}
