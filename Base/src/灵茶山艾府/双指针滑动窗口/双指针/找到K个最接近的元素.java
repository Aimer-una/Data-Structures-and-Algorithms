package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class 找到K个最接近的元素 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;
        while (right - left + 1 > k){
            if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)){
                // arr[left]离x比较远，left++
                left++;
            }else{
                right--;
            }
        }
        for (int i = left; i <= right; i++) {
            ans.add(arr[i]);
        }
        return ans;
    }
}
