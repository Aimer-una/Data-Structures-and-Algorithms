package 灵茶山艾府.双指针滑动窗口.滑动窗口;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 几乎唯一子数组的最大和 {
    public long maxSum(List<Integer> nums, int m, int k) {
        long sum = 0;
        long result = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            int x = nums.get(i);
            sum += x;
            map.put(x,map.getOrDefault(x,0)+1);
            // 获取当前窗口的位置
            int left = i-k+1;

            // 如果窗口大小没有满足k，那么直接跳过进入下一层循环
            if (left < 0){
                continue;
            }
            // 不同元素 ≥ m，更新答案
            if (map.size() >= m){
                result = Math.max(sum,result);
            }

            // 左端点离开窗口，为下一个循环做准备
            sum -= nums.get(left);
            map.put(nums.get(left),map.get(nums.get(left)) - 1);

            // 如果要离开的窗口的这个数在map中减去1后只剩0次了，那么直接将他从map中删去;
            if (map.get(nums.get(left)) == 0){
                map.remove(nums.get(left));
            }
        }
        return result;
    }
}
