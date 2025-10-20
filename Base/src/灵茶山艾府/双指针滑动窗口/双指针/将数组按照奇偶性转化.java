package 灵茶山艾府.双指针滑动窗口.双指针;

public class 将数组按照奇偶性转化 {
    public int[] transformArray(int[] nums) {
        int stackSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                nums[stackSize++] = 0;
            }
        }
        for (int i = stackSize; i < nums.length; i++) {
            nums[i] = 1;
        }
        return nums;
    }
}
