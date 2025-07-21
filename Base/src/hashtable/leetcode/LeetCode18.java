package hashtable.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode18 {
    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,0,1,2,3};
        int target = 0;
        List<List<Integer>> list = fourSum(nums, target);
        System.out.println(list);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int k = 0; k < nums.length; k++) {
            // 减枝
            if (nums[k]>target && nums[k]>0 ){
                break; // 此处的break可以等价于return result;
            }
            // 去重
            if (k>0 && nums[k] == nums[k-1]){
                continue;
            }
            for (int i = k+1; i < nums.length; i++) {
                // 减枝
                if (nums[k]+nums[i] > target && nums[k]+nums[i]>0 ){
                    break; // 注意是break到上一级for循环，如果直接return result;会有遗漏
                }
                // 去重
                if (i > k+1 && nums[i] == nums[i-1]){
                    continue;
                }
                int right = nums.length-1;
                int left = i+1;
                while (right > left){
                    long sum = (long) nums[k]+nums[i]+nums[right]+nums[left];
                    if (sum > 0){
                        right--;
                    }else if (sum < 0){
                        left++;
                    }else {
                        result.add(Arrays.asList(nums[k],nums[i],nums[right],nums[left]));
                        // 对nums[left]和nums[right]去重
                        while (nums[right] == nums[right-1]){
                            right--;
                        }
                        while (nums[left] == nums[left+1]){
                            left++;
                        }
                        right--;
                        left++;
                    }
                }
            }
        }
        return result;
    }
}
