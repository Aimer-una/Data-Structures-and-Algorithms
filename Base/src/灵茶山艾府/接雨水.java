package 灵茶山艾府;

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
}
