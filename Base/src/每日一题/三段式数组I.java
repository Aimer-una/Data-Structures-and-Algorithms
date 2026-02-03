package 每日一题;

public class 三段式数组I {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        // 第一段
        int i = 1;
        while (i < n && nums[i-1] < nums[i]) {
            i++;
        }
        if (i == 1){
            return false;
        }
        // 第二段
        int i1 = i;
        while (i < n && nums[i-1] > nums[i]){
            i++;
        }
        if (i == i1 || i == n){
            return false;
        }
        // 第三段
        while (i < n && nums[i-1] < nums[i]){
            i++;
        }
        return i == n;
    }
}
