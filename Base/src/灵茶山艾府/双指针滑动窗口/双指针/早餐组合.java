package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.Arrays;

public class 早餐组合 {
    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        int i = 0;
        // 从最大饮料开始
        int j = drinks.length - 1;
        int count = 0;
        final int MOD = 1000000007;
        Arrays.sort(staple);
        Arrays.sort(drinks);
        while (i < staple.length && j >= 0){
            if (staple[i] + drinks[j] <= x){
                // staple[i] 可以和 drinks[0..j] 所有饮料搭配
                // 共有 j + 1 种饮料可以搭配这个主食(加一是因为数组是从0开始计数)
                count = (count + j + 1) % MOD;
                // 尝试下一个更大的主食
                i++;
            }else {
                // 当前饮料太大，换更小的
                j--;
            }
        }
        return count;
    }
}
