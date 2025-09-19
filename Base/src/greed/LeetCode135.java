package greed;

import java.util.Arrays;
// 135. 分发糖果
public class LeetCode135 {
    public int candy(int[] ratings) {
        int sum = 0;
        int[]candy = new int[ratings.length];
        Arrays.fill(candy,1);
        // 找右边比左边大的
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i-1]){
                candy[i] = candy[i-1] + 1;
            }
        }

        // 找左边比右边大的(从最后面开始找)
        for (int i = ratings.length - 2; i >= 0 ; i--) {
            if (ratings[i] > ratings[i+1]){
                candy[i] = Math.max(candy[i],candy[i+1]+1);
            }
        }
        for (int i = 0; i < candy.length; i++) {
            sum += candy[i];
        }
        return sum;
    }
}
