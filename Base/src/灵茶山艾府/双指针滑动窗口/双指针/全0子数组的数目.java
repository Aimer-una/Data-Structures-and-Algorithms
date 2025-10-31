package 灵茶山艾府.双指针滑动窗口.双指针;

public class 全0子数组的数目 {
    public long zeroFilledSubarray(int[] nums) {
        int last = -1;
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                last = i;
            }else {
                ans += i - last;
            }
        }
        return ans;
    }

    public long zeroFilledSubarray1(int[] nums) {
        int i = 0;
        long ans = 0;
        int n = nums.length;
        while (i < n){
            if (nums[i] != 0){
                i++;
                continue;
            }
            int start = i;
            while (i < n && nums[i] == 0){
                i++;
            }
            long k = i-start;
            ans += k* (k+1) / 2;
        }
        return ans;
    }
}
