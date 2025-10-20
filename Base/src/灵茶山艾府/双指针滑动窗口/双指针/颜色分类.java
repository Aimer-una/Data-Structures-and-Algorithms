package 灵茶山艾府.双指针滑动窗口.双指针;

public class 颜色分类 {
    public void sortColors(int[] nums) {
        int p0 = 0;
        int p1 = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            nums[i] = 2;
            if (x <= 1){
                nums[p1++] = 1;
            }
            if (x == 0){
                nums[p0++] = 0;
            }
        }
    }
}
