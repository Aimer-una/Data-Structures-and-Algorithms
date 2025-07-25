package hashtable.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {
    public static void main(String[] args) {
        int [] array = {2,5,5,11};
        System.out.println(Arrays.toString(twoSumMap(array, 10)));
    }
    // 暴力枚举
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    return new int [] {i,j};
                }
            }
        }
    return null;
    }

    // 使用map哈希表结构
    public static int[] twoSumMap(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.containsKey(value)) {
               return new int [] {map.get(value),i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
