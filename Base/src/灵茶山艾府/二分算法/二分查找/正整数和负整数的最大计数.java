package 灵茶山艾府.二分算法.二分查找;

public class 正整数和负整数的最大计数 {
    public int maximumCount(int[] nums) {
        int plus = lowerBound(nums,1);
        int plusAns = nums.length - plus;
        int minute = lowerBound(nums,0) - 1;
        int minuteAns = minute + 1;
        return Math.max(plusAns,minuteAns);
    }

    public int lowerBound(int[] nums,int target){
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
