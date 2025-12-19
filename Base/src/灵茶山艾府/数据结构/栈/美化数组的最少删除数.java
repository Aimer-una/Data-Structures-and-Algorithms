package 灵茶山艾府.数据结构.栈;

public class 美化数组的最少删除数 {
    public int minDeletion(int[] nums) {
        int topNum = nums[0];
        int size = 1;
        for (int i = 1; i < nums.length; i++) {
            if (size % 2 != 0 && nums[i] == topNum){
                continue;
            }
            topNum = nums[i];
            size++;
        }
        int len = size % 2 == 0? size : size - 1;
        return nums.length - len;
    }
}
