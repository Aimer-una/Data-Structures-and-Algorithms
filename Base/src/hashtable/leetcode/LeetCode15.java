package hashtable.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15 {
    public static void main(String[] args) {
        int [] nums = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        int [] nums1 = {0,0,0};
        System.out.println(threeSum(nums1));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // 排序之后如果第一个元素已经大于零，那么无论如何组合都不可能凑成三元组，直接返回结果就可以了
            if (nums[i]>0){
                return result;
            }
            if (i>0 && nums[i] == nums[i-1]){
                continue;
            }
/*            while (i < nums.length && i>0 && nums[i] == nums[i-1]  ){ //去重a
                i++; //如果这里使用i++的话并不会判断i++的这个数和前一个是否相等,如果改成while循环的话会产生索引越界异常
                但是加上加上i < nums.length条件后就好
            }*/
            int left = i+1;
            int right = nums.length - 1;
            while (right > left){
                int sum = nums[i] + nums[right] + nums[left];
                if (sum > 0){
                    right -- ;
                }else if (sum<0){
                    left++;
                }else {
                    // 创建一个包含三个指定元素的、固定大小的列表（List）。
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    // 去重逻辑应该放在找到一个三元组之后，对b 和 c去重
                    // 去重的逻辑一定要放在收获结果的下面，即至少要收获一个符合条件的结果
                    while (right > left && nums[right] == nums[right - 1]) right--;
                    while (right > left && nums[left] == nums[left + 1]) left++;

                    right--;
                    left++;
                }
            }
            
        }
        return result;
    }
}
