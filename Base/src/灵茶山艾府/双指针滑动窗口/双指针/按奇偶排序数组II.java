package 灵茶山艾府.双指针滑动窗口.双指针;

public class 按奇偶排序数组II {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 1;
        while (i < nums.length){
            if (nums[i] % 2 == 0){
                i+=2;
            }else if (nums[j] % 2 == 1){
                j+=2;
            }else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i+=2;
                j+=2;
            }
        }
        return nums;
    }
}
