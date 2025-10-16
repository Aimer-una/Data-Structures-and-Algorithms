package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 三数之和复习 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        // 为什只移动到小于n-2，因为到最后left = n-2 右指针right = n-1
        for (int i = 0; i < n-2; i++) {
            int x = nums[i];
            if (i > 0 && nums[i-1] == x){
                continue;
            }
            // 如果x 加上当前最小的两个数都大于0那么后面的肯定也大于0
            if (x + nums[i+1] + nums[i+2] > 0){
                break;
            }
            // 如果x和当前最大的两位数加起来都小于0，那么continue，因为x还有可能增大
            if (x + nums[n-2] + nums[n-1] < 0){
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while (left < right){
                if (x + nums[left] + nums[right] < 0){
                    left++;
                }else if (x + nums[left] + nums[right] > 0){
                    right--;
                }else {
                    ans.add(List.of(x,nums[left],nums[right]));
                    // 对left和right去重
                    while (left < right && nums[right] == nums[right-1]){
                        right--;
                    }
                    while (left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    right--;
                    left++;
                }
            }
        }
        return ans;
    }
}
