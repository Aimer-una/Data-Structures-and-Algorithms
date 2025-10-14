package 灵茶山艾府.双指针滑动窗口.双指针;

public class 有序数组的平方 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int left = 0;
        int right = n-1;
        for (int i = n-1; i >= 0; i--) {
            if (nums[left] * nums[left] > nums[right] * nums[right]){
                ans[i] = nums[left]*nums[left];
                left++;
            }else {
                ans[i] = nums[right]*nums[right];
                right--;
            }
        }
        return ans;
    }
}
