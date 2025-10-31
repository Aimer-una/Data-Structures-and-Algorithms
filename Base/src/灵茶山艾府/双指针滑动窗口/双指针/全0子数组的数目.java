package 灵茶山艾府.双指针滑动窗口.双指针;

public class 全0子数组的数目 {
    public long zeroFilledSubarray(int[] nums) {
        int last = -1; // 上一个非 0 元素的位置，初始为 -1（虚拟位置）
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                last = i;  // 遇到非 0，更新 last
            }else {
                // 当前是 0，那么从 last+1 到 i 都是连续的 0
                // 以 i 结尾的全 0 子数组个数 = i - last
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
                i++; // 跳过非 0
                continue;
            }
            int start = i;
            while (i < n && nums[i] == 0){
                i++;
            }
            // [start, i) 是一段连续 0，长度 k = i - start
            long k = i-start;
            ans += k* (k+1) / 2;
        }
        return ans;
    }
}
