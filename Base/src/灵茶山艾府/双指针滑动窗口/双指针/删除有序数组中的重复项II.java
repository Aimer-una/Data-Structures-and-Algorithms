package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.HashMap;
import java.util.Map;

public class 删除有序数组中的重复项II {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int index = 0;
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
            if (map.get(num) < 2){
                nums[index++] = num;
            }
        }
        return index;
    }
}
