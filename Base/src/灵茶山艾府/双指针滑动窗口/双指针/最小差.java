package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.Arrays;

public class 最小差 {
    public int smallestDifference(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        int j = 0;
        long ans = Integer.MAX_VALUE;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) return 0;
            // a[i] > b[j],说明两者相减是一个正数。通过j++来寻找b数组中更大的数，看看能不能相减得到最少值
            if (a[i] > b[j]) {
                ans = Math.min(ans,(long) a[i] - (long) b[j]);
                j++;
            } else {
                // a[i] < b[j],说明两者相减是一个正数。通过i++来寻找a数组中更大的数，看看能不能相减得到最少值
                ans = Math.min(ans,(long) b[j] -(long) a[i]);
                i++;
            }
        }
        return (int) ans;
    }
}