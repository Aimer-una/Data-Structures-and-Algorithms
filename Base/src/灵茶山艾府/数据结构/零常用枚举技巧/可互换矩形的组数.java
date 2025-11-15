package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.HashMap;
import java.util.Map;

public class 可互换矩形的组数 {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<String,Long> map = new HashMap<>();
        int ans  = 0;
        for (int[] rectangle : rectangles) {
            int w = rectangle[0];
            int h = rectangle[1];
            int g = gcd(w,h);
            // 化为最简分数
            w /= g;
            h /= g;
            String key = w + ":" + h; // 或者用其他方式编码
            ans += map.getOrDefault(key,0L);
            map.put(key,map.getOrDefault(key,0L)+1);

        }
        return ans;
    }

    // 求最大公约数方法
    private int gcd(int a,int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
