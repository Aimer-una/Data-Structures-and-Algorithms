package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.ArrayList;
import java.util.List;

public class 汇总区间 {
    public List<String> summaryRanges(int[] nums) {
        int i = 0;
        int n = nums.length;
        List<String> list = new ArrayList<>();
        while (i < n){
            int start = i;
            i++;
            while (i < n && nums[i] - nums[i-1] == 1){
                i++;
            }
            StringBuilder sb = new StringBuilder();
            int len = i - start;
            if (len == 1){
                sb.append(nums[start]);
                list.add(sb.toString());
            }else {
                sb.append(nums[start]).append("->").append(nums[i - 1]);
                list.add(sb.toString());
            }
        }
        return list;
    }
}
