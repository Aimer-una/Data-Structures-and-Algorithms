package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.Arrays;
import java.util.Map;

public class 两个数组间的距离值 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int j = 0;
        int ans = 0;
        for (int x : arr1) {
            while (j < arr2.length && arr2[j] < x - d){
                j++;
            }
            if (j == arr2.length || arr2[j] > x + d){
                ans++;
            }
        }
        return ans;
    }
    public int findTheDistanceValue1(int[] arr1, int[] arr2, int d){
        int ans = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean valid = true;
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d){
                    valid = false;
                    break;
                }
            }
            if (valid){
                ans++;
            }
        }
        return ans;
    }

}
