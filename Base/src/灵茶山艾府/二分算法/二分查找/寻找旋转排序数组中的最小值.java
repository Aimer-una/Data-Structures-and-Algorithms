package 灵茶山艾府.二分算法.二分查找;

public class 寻找旋转排序数组中的最小值 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int mid = left + right >>> 1;
            if (nums[mid] > nums[right]){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return nums[left];
    }
}
