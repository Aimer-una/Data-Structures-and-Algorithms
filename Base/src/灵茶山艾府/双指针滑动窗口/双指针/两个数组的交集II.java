package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.*;

public class 两个数组的交集II {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int count = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (i < nums1.length && j < nums2.length){
            if (nums1[i] == nums2[j]){
                count++;
                i++;
                j++;
            }else if (nums1[i] < nums2[j]){
                i++;
            }else {
                j++;
            }
        }

        // 第二步：创建结果数组并填充
        int[] ans = new int[count];
        i = 0; j = 0; // 重置指针
        int k = 0;    // ans 的写入指针
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                ans[k++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return ans;
    }
}
