package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.HashMap;
import java.util.Map;

public class 数组中的最大数对和 {
    public int maxSum(int[] nums) {
        int ans = -1;
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            int maxDigit = getMaxDigit(num);
            if (map.containsKey(maxDigit)){
                ans = Math.max(ans,num + map.get(maxDigit));
            }
            // 更新该最大数位对应的最大值
            map.put(maxDigit,Math.max(map.getOrDefault(maxDigit,0),num));
        }
        return ans;
    }

    // 辅助函数：求一个正整数的最大数位
    private int getMaxDigit(int num){
        int maxD = 0;
        while (num > 0){
            maxD = Math.max(maxD,num % 10);
            num = num / 10;
        }
        return maxD;
    }
}
