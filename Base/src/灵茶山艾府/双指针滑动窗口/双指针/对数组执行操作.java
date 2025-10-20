package 灵茶山艾府.双指针滑动窗口.双指针;

public class 对数组执行操作 {
    public int[] applyOperations(int[] nums) {
        int stackSize = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]){
                nums[i - 1] = nums[i] * 2;
                nums[i] = 0;

            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[stackSize++] = nums[i];
            }
        }

        for (int i = stackSize; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}
