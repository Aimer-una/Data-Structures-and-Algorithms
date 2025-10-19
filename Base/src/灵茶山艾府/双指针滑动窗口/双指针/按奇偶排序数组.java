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
    public int[] sortArrayByParity1(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            if (nums[left] % 2 == 0){
                left++;
            }else if (nums[right] % 2 == 1){
                right--;
            }else {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                // 交换后，问题变成 [i+1,j-1] 的子问题
                left++;
                right--;

            }
        }
        return nums;
    }
}
