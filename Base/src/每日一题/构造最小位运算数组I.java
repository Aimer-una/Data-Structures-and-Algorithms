package 每日一题;

import java.util.List;

public class 构造最小位运算数组I {
    // x | (x+1) 相当于把 x 最左边的 0 改成 1
    // 结果把nums[i] 最右边的0的右边的1变成0
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int x = nums.get(i);
            if (x == 2){
                ans[i] = -1;
            }else {
                int t = ~x;
                int lowbit = t & -t;
                ans[i] = x ^ (lowbit >> 1);
            }
        }
        return ans;
    }
}
