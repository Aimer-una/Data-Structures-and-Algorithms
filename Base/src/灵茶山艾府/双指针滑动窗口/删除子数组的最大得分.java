package 灵茶山艾府.双指针滑动窗口;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 删除子数组的最大得分 {
    public static void main(String[] args) {
        System.out.println(maximumUniqueSubarray(new int[]{5,2,1,2,5,2,1,2,5}));
    }
    public static int maximumUniqueSubarray(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int ans = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int c = nums[i];
            sum += c;
            map.put(c,map.getOrDefault(c,0)+1);
            while (map.get(nums[i]) > 1){
                map.put(nums[left],map.get(nums[left])-1);
                if (map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                sum -= nums[left];
                left++;
            }
            ans = Math.max(ans,sum);
        }
        return ans;
    }
    public  int maximumUniqueSubarray1(int[] nums){
        int left = 0;
        int sum = 0;
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            sum += x;
            while (set.contains(x)) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            set.add(x);
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
