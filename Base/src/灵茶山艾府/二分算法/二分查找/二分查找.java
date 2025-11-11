package 灵茶山艾府.二分算法.二分查找;

public class 二分查找 {
    public int search(int[] nums, int target) {
        int ans = lowerBound(nums, target);
        if (ans == nums.length || nums[ans] != target){
            return -1;
        }
        return ans;
    }

    private int lowerBound(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + right >>> 1;
            if (nums[mid] >= target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
}
