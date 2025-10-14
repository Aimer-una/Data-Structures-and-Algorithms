package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class 数组中的k个最强值 {
    public int[] getStrongest(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        Arrays.sort(arr);
        int m = arr[(arr.length - 1) / 2];
        int[]ans = new int[k];
        for (int i = 0; i < k; i++) {
            int leftNumber = Math.abs(arr[left] - m);
            int rightNumber = Math.abs(arr[right] - m);
            if (leftNumber > rightNumber){
                ans[i] = arr[left];
                left++;
            }else if (leftNumber < rightNumber){
                ans[i] = arr[right];
                right--;
            }else {
                if (arr[left] > arr[right]){
                    ans[i] = arr[left];
                    left++;
                }else {
                    ans[i] = arr[right];
                    right--;
                }
            }
        }
        return ans;
    }
}
