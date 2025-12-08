package 每日一题;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 统计平方和三元组的数目 {
    // 暴力
    public int countTriples(int n) {
        int ans = 0;
        for (int i = n; i >= 1; i--) {
            int max = i * i;
            for (int a = n - 1; a >= 1  ; a--) {
                for (int b = n - 1; b >= 1 ; b--) {
                    if (a * a + b * b == max){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static int countTriplesHash(int n) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = n; i >= 1; i--) {
            int max = i * i;
            set.clear();
            for (int num = n - 1; num >= 1  ; num--) {
                int numDouble = num * num;
                int x = max - numDouble;
                if (set.contains(x)) {
                    ans+=2;
                }
                set.add(numDouble);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countTriplesHash(10));
    }
}
