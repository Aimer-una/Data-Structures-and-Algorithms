package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.ArrayList;
import java.util.List;

public class 合并两个二维数组求和法 {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        int n = nums1.length;
        int m = nums2.length;
        while (i < n && j < m){
            int id1 = nums1[i][0],value1 = nums1[i][1];
            int id2 = nums2[j][0],value2 = nums2[j][1];
            if (id1 == id2){
                ans.add(new int[]{id1,value1+value2});
                i++;
                j++;
            }else if (id1 < id2){
                ans.add(new int[]{id1,value1});
                i++;
            }else {
                ans.add(new int[]{id2,value2});
                j++;
            }
        }
        while (i < n){
            ans.add(nums1[i++]);
        }
        while (j < m){
            ans.add(nums2[j++]);
        }
        return ans.toArray(new int[0][]);
    }
}
