package 灵茶山艾府.二分算法.二分查找;

public class 使结果不超过阈值的最小除数 {
    public int smallestDivisor(int[] nums, int threshold) {
        // 定义左右边界
        int max = 0;
        for (int num : nums) {
            max = Math.max(max,num);
        }
        int left = 1;
        int right = max;
        int ans = max;
        while (left <= right){
            int mid = left + right >>> 1;
            if (calculateSum(nums,mid,threshold)) {
                // mid 是一个可行解，尝试找更小的
                ans = mid;
                right = mid - 1; // 缩小右边界，往左搜
            }else {
                // mid 太小，总和超了，需要更大的除数
                left = mid + 1;
            }
        }
        return ans;
    }

    private boolean calculateSum(int[]nums , int d,int threshold){
        int sum = 0;
        for (int num : nums) {
            sum += (num+d-1)/d;//向上取整
            if (sum > threshold){
                return false;
            }
        }
        return true;
    }
}
