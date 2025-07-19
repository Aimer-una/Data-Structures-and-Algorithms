package hashtable.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        // 定义一个map用来存储a+b的值出现的次数
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums1) {
            for (int j : nums2) {
                 int sum = i+j;
                if (map.containsKey(sum)){
                    map.put(sum,map.get(sum)+1);
                }else {
                    map.put(sum,1);
                }
            }
        }
        for (int i : nums3) {
            for (int j : nums4) {
                // 0-(c+d) = a+b ==> a+b+c+d=0
                int sum = 0-i-j;
                if (map.containsKey(sum)){
                    count+=map.get(sum);
                }

            }
        }
        return count;
    }
}
