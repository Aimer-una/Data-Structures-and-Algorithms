package hot100;

public class 缺失的第一个正数 {
    public int firstMissingPositive(int[] nums) {

        //  第一步：检查是否存在 1
        boolean hasOne = false;
        for (int num : nums) {
            if (num == 1) {
                hasOne = true;
                break;
            }
        }
        if (!hasOne) {
            return 1; // 最小正整数 1 都没出现！
        }

        // 把所有小于0或者大于数组长度的数变成1
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n){
                nums[i] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]) - 1;
            nums[num] = - Math.abs(nums[num]);
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0){
                return i+1;
            }
        }
        return n + 1;
    }
}
