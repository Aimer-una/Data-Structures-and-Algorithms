package 灵茶山艾府.双指针滑动窗口;

public class 最大连续1的个数III {
    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 3));
    }
    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int ans = 0;
        int zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                zero++;
            }

            while (zero > k ){
                if (nums[left] == 0){
                    zero--;
                }
                left++;
            }
            ans = Math.max(ans,i-left+1);
        }
        return ans;
    }
}
