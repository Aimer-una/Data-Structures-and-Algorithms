package 灵茶山艾府.双指针滑动窗口.滑动窗口;

public class 盛最多水的容器 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int ans = 0;
        while (left < right){
            int area = (right - left) * Math.min(height[left],height[right]);
            ans = Math.max(area,ans);
            if (height[left] < height[right]){
                left++;
            }else {
                right--;
            }
        }
        return ans;
    }
}
