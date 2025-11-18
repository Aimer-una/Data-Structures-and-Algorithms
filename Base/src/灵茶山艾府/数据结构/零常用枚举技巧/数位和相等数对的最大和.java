package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.HashMap;
import java.util.Map;

public class 数位和相等数对的最大和 {
    public int maximumSum(int[] nums) {
        int ans = -1;
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            int digital = getDigital(num);
            if (map.containsKey(digital)){
               ans = Math.max(ans,map.get(digital)+num);
            }
            map.put(digital,Math.max(map.getOrDefault(digital,0),num));
        }
        return ans;
    }

    private int getDigital(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
