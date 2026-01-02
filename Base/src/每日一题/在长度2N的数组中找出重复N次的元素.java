package 每日一题;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 在长度2N的数组中找出重复N次的元素 {
    public int repeatedNTimes(int[] nums) {
        int length = nums.length;
        int n = length / 2;
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer value = map.get(nums[i]);
            if (value == n){
                return nums[i];
            }
        }
        return -1;
    }

    public int repeatedNTimesSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)){
                return num;
            }
        }
        return -1;
    }
}
