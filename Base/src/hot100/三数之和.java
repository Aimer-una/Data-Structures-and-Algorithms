package hot100;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 三数之和 {
    // 两数之和Ⅱ
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right){
            if (numbers[left] + numbers[right] > target){
                right--;
            }else if(numbers[left] + numbers[right] < target){
                left++;
            }else{
                return new int[]{left+1,right+1};
            }
        }
        return null;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            if (i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            int x = nums[i];
            int left = i + 1;
            int right = n - 1;
            while (left < right){
                int ans = x + nums[left] + nums[right];
                if (ans > 0){
                    right--;
                }else if (ans < 0){
                    left++;
                }else {
                    result.add(List.of(x,nums[left],nums[right]));
                    while (left < right && nums[left] == nums[left + 1]){
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]){
                        right--;
                    }
                    left++;
                    right--;
                }

            }
        }
        return result;
    }
}
