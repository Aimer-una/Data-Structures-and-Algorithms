package 灵茶山艾府.双指针滑动窗口;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 长度为K子数组中的最大和 {
    public static void main(String[] args) {
        maximumSubarraySum(new int[]{1,5,4,2,9,9,9},3);
    }
    public static long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long result = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            sum += x;
            map.put(x,map.getOrDefault(x,0)+1);

            int left = i-k+1;
            if (left < 0){
                continue;
            }

            if (map.size() == k){
                result = Math.max(sum,result);
            }

            sum -= nums[left];
            if (map.get(nums[left]) > 1){
                map.put(nums[left] , map.get(nums[left])-1);
            }else {
                map.remove(nums[left]);
            }
        }
        return result;
    }
}
