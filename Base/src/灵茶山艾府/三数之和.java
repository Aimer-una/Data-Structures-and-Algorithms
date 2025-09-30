package 灵茶山艾府;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n-2; i++) {
            int x = nums[i];
            if (i > 0 && x == nums[i-1]){
                continue;
            }
            // 如果x和当前最小的两位数加起来都大于0，那么加后面的数肯定更大所以直接break
            if (x + nums[i+1] + nums[i+2] > 0){
                break;
            }
            // 如果x和当前最大的两位数加起来都小于0，那么continue，因为x还有可能增大
            if (x + nums[n-1] + nums[n-2] < 0){
                continue;
            }
            int left = i+1;
            int right = n-1;
            while (left < right){
                if (nums[left] + nums[right] + x > 0){
                    right--;
                }else if (nums[left] + nums[right] + x < 0){
                    left++;
                }else {
                    result.add(List.of(x,nums[left],nums[right]));
                    // 对left和right去重
                    while (left < right && nums[right] == nums[right-1]) right--;
                    while (left < right && nums[left] == nums[left+1]) left ++;
                    // 上面两个while循环去重只是让两个指针到达最后一个重复元素的位置，所以还需要++--
                    right--;
                    left++;
                }
            }
        }
        return result;
    }
}
