package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.List;

public class 检测相邻递增子数组II{
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int ans = 0;
        int ctn = 0;
        int preCtn = 0;
        for (int i = 0; i < nums.size(); i++) {
            ctn++;
            if (i == nums.size() - 1 || nums.get(i) >= nums.get(i+1)){
                ans = Math.max(ans,Math.max(ctn / 2,Math.min(preCtn,ctn)));
                preCtn = ctn;
                ctn = 0;
            }
        }
        return ans;
    }
}
