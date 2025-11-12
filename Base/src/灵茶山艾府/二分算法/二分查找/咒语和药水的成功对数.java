package 灵茶山艾府.二分算法.二分查找;

import java.util.Arrays;

public class 咒语和药水的成功对数 {
    public static void main(String[] args) {
        int[] ints = successfulPairs(new int[]{5, 1, 3}, new int[]{1, 2, 3, 4, 5}, 7);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int index = 0;
        int[] ans = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            int left = 0;
            int right = potions.length - 1;
            // 寻找目标值
            long target =  ((spells[i] + success - 1) / spells[i]); // 向上取整公式
            while (left <= right){
                int mid = left + right >>> 1;
                if (potions[mid] >= target){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }
            ans[index++] = potions.length - left;
        }
        return ans;
    }
}
