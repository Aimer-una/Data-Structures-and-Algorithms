package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.Arrays;

public class 找出与数组相加的整数II {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        // 直接删掉最小的两个
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i = 2; i >= 0; i--) {
            int x = nums2[0] - nums1[i];
            int j = 0;
            for (int k = i; k < nums1.length; k++) {
                if (j < nums2.length && nums1[k] + x == nums2[j]){
                    j++;
                }
            }
            if (j == nums2.length){
                return x;
            }
        }
        return 0;
    }
}
