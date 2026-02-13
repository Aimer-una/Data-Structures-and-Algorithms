package hot100;

import java.util.HashMap;

public class 两数之和 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{i,map.get(nums[i])};
            }
            int num = target- nums[i];
            map.put(num,i);
        }
        return new int[]{-1,-1};
    }
}
