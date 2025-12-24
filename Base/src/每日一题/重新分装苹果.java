package 每日一题;

import java.util.Arrays;

public class 重新分装苹果 {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for (int s : apple) {
            sum += s;
        }
        int m = capacity.length;
        Arrays.sort(capacity);
        int i = m - 1;
        while (sum > 0){
            sum -= capacity[i];
            i--;
        }
        return m - 1 - i;
    }
}
