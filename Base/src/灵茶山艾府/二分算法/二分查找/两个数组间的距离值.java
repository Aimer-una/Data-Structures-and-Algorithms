package 灵茶山艾府.二分算法.二分查找;

import java.util.Arrays;

public class 两个数组间的距离值 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int ans = 0;
        // arr2中的数不能在 危险区间内
        for (int x : arr1) {
            int left = x - d; // 危险区左边界
            int right = x + d; // 危险区右边界
            int idx = lowerBound(arr2, left);
            // 找 arr2 中第一个 >= left 的位置（比如第一个 ≥3 的位置）
            if (idx < arr2.length && arr2[idx] <= right){
                continue;
            }
            ans++;
        }
        return ans;
    }

    private int lowerBound(int[] arr2, int target){
        int left = 0;
        int right = arr2.length - 1;
        while (left <= right){
            int mid = left + right >>> 1;
            if (arr2[mid] >= target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
}
