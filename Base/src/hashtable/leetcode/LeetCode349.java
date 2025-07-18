package hashtable.leetcode;

import java.util.*;

public class LeetCode349 {
    public static void main(String[] args) {
        int[]nums1 = {1,2,3,4,2};
        int[]nums2 = {2,2,3};
        int[] intersection = intersection(nums1, nums2);
        int[] intersection1 = intersection1(nums1, nums2);
        int[] intersection2 = intersection2(nums1, nums2);
        System.out.println(Arrays.toString(intersection));
        System.out.println(Arrays.toString(intersection1));
        System.out.println(Arrays.toString(intersection2));
    }
    // 使用hashset
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0){
            return new int[0];
        }
        // 定义两个set集合，一个用来将数组转化为set，另一个用来存储相同的数据交集（因为set可以自动去重）
        Set<Integer> set = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            // nums2中的数据是否存在于set集合中
            if (set.contains(nums1[i])){
                // 存在则加入到交集set中
                resSet.add(nums2[i]);
            }
        }
        int [] array = new int[resSet.size()];
        int j = 0;
        for (Integer i : resSet) {
            array[j] = i;
            j++;
        }
        return array;
    }
    // 暴力枚举
    public static int[] intersection1(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0){
            return new int[0];
        }
        Set<Integer> resSet = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]){
                    resSet.add(nums1[i]);
                }
            }
        }
        int [] array = new int[resSet.size()];
        int j = 0;
        for (Integer i : resSet) {
            array[j] = i;
            j++;
        }
        return array;
    }

    // 使用hash数组
    public static int[] intersection2(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0){
            return new int[0];
        }
        // 定义两个hash数组来记录数据的出现
        int[]hash1 = new int[1002];
        int[]hash2 = new int[1002];

        for (int i : nums1) {
            hash1[i]++;
        }
        for (int i : nums2) {
            hash2[i]++;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1002; i++) {
            if (hash1[i]>0 && hash2[i]>0){
                list.add(i);
            }
        }
        System.out.println("list:"+list);
        // 将list转化为数组
        int[]array = new int[list.size()];
        int index = 0;
        for (Integer i : list) {
            array[index] = i;
            index++;

        }
        return array;
    }
}
