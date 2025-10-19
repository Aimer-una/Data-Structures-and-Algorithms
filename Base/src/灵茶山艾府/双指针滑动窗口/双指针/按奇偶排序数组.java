package 灵茶山艾府.双指针滑动窗口.双指针;

public class 按奇偶排序数组 {
    public int[] sortArrayByParity(int[] nums) {
        int i0 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                int temp = nums[i];
                nums[i] = nums[i0];
                nums[i0] = temp;
                i0++;
            }
        }
        return nums;
    }
}
