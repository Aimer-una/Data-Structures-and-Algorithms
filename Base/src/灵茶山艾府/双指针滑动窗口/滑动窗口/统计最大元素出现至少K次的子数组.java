package 灵茶山艾府.双指针滑动窗口.滑动窗口;


public class 统计最大元素出现至少K次的子数组 {
    public long countSubarrays(int[] nums, int k) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max,num);
        }
        int left = 0;
        int ctnMax = 0;
        long ans = 0;
        for (int num : nums) {
            if (max == num){
                ctnMax++;
            }
            while (ctnMax == k){
                if (nums[left] == max){
                    ctnMax--;
                }
                left++;
            }
            ans += left;
        }
        return ans;
    }
}
