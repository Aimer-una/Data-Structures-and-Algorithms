package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.HashMap;
import java.util.Map;

public class 数的平方等于两数乘积的方法数 {
    public int numTriplets(int[] nums1, int[] nums2) {
        return count(nums1,nums2) + count(nums2,nums1);
    }

    private int count(int[] A, int[] B){
        Map<Long,Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                long prod = (long) A[i] * A[j];
                map.put(prod,map.getOrDefault(prod,0)+1);
            }
        }
        int total = 0;
        for (int i : B) {
            long square = (long) i * i;
            total += map.getOrDefault(square, 0);
        }
        return total;
    }
}
