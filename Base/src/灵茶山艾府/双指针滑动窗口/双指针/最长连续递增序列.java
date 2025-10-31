package 灵茶山艾府.双指针滑动窗口.双指针;

public class 最长连续递增序列 {
    public int findLengthOfLCIS(int[] nums) {
        int i = 0;
        int n = nums.length;
        int ans = 0;
        while (i < n){
            int start = i;
            i++;
            while (i < n && nums[i] > nums[i-1]){
                i++;
            }
            ans = Math.max(ans,i-start);
        }
        return ans;
    }
}
