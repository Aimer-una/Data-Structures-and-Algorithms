package 灵茶山艾府.双指针滑动窗口.滑动窗口;

public class 接雨水 {
    public int trap(int[] height) {
        int [] preMax = new int[height.length];
        int sum = 0;
        preMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
           preMax[i] = Math.max(height[i],preMax[i-1]);
        }
        int [] sufMax = new int[height.length];
        sufMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            sufMax[i] = Math.max(height[i],sufMax[i+1]);
        }
        for (int i = 0; i < height.length; i++) {
            sum += Math.min(sufMax[i],preMax[i]) - height[i];
        }
        return sum;
    }

    // 方法二（时间复杂度O(n),空间复杂度O(1)）
    public int trap2(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int sum = 0;
        while (left < right){
            if (height[left] < height[right]){
                if (height[left] > leftMax){
                    leftMax = height[left];
                    left++;
                }else {
                    sum += leftMax - height[left];
                }
            }else {
                if (height[right] < rightMax){
                    rightMax = height[right];
                    right--;
                }else {
                    sum += rightMax + height[right];
                }
            }
        }
        return sum;
    }
}
