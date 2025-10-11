package 灵茶山艾府.双指针滑动窗口.滑动窗口;

import java.util.HashMap;
import java.util.Map;

public class 水果成篮 {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int ans = 0;
        for (int i = 0; i < fruits.length; i++) {
            int fruitType = fruits[i];
            map.put(fruitType,map.getOrDefault(fruitType,0)+1);
            while (map.size() > 2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if (map.get(fruits[left]) == 0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            ans = Math.max(ans,i-left+1);
        }
        return ans;
    }
}
