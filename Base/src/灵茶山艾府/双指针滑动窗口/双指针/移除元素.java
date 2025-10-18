package 灵茶山艾府.双指针滑动窗口.双指针;

public class 移除元素 {
    public int removeElement(int[] nums, int val) {
        int stackSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[stackSize++] = nums[i];
            }
        }
        return stackSize;
    }
}
