package 灵茶山艾府.双指针滑动窗口.双指针;

public class 移动零 {
    public void moveZeroes(int[] nums) {
        int stackSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[stackSize++] = nums[i];
            }
        }
        for (int i = stackSize; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
