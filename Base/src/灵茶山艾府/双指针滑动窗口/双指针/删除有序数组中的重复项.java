package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.HashMap;
import java.util.Map;

public class 删除有序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
                nums[index++] = nums[i];
            }
        }
        return index;
    }
    public int removeDuplicates1(int[] nums) {
        int slow = 1;
        for (int fast = 1; fast < nums.length; slow++) {
            if (nums[fast] != nums[fast - 1]){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
