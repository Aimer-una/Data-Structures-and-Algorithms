package 灵茶山艾府.二分算法.二分查找;

public class 寻找峰值 {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 2;
        while (left <= right){
            int mid = left + right >>> 1;
            if (nums[mid] > nums[mid+1]){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
}
