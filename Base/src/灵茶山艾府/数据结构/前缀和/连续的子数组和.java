package 灵茶山艾府.数据结构.前缀和;

import java.util.HashMap;
import java.util.Map;

public class 连续的子数组和 {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> cnt = new HashMap<>();
        // 为什么先put 0 -1 这个键值对，因为如果遍历到i为1的前缀和时刚好可以整除的话就可以得到正确答案
        // 否则将会跳过这个答案
        // 比如 （1，2） k = 3
        // i = 1 是 前缀和是3 刚好可以被3整除 余数是0
        // 这时候取map中找0的下标，发现0的下标是-1 然后 i = 1   1-（-1） = 2; 得到正确答案
        cnt.put(0,-1);
        int prefixSum  = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int s = prefixSum % k;
            if (s < 0){
                s += k;
            }
            if (cnt.containsKey(s)){
                // 同余定义（只要它们的余数相同就可以被整除）
                if (i - cnt.get(s) >= 2){
                    return true;
                }
            }else {
                cnt.put(s,i);
            }
        }
        return false;
    }
}
