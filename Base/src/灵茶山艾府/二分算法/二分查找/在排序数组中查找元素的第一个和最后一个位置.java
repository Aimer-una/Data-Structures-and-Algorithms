package 灵茶山艾府.二分算法.二分查找;

public class 在排序数组中查找元素的第一个和最后一个位置 {
    public int[] searchRange(int[] nums, int target) {
        int start = lowerBound(nums,target);
        if (start == nums.length || nums[start] != target){
            return new int[]{-1,-1};
        }
        int end = lowerBound(nums,target+1) - 1;
        return new int[]{start,end};
    }

    private int lowerBound(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + right >>> 1;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        // 循环结束后 left = right+1
        // 此时 nums[left-1] < target 而 nums[left] = nums[right+1] >= target
        // 所以 left 就是第一个 >= target 的元素下标
        return left;
    }
}
