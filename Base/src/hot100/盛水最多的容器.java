package hot100;

public class 盛水最多的容器 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int ans = 0;
        while (left < right){
            // 计算面积(宽度为长最小的那条线，漏桶问题) 如果宽度越小能存储的水也就越少
            int area = (right - left) * Math.min(height[left],height[right]);
            ans = Math.max(ans,area);
            if (height[left] < height[right]){
                left++;
            }else {
                right--;
            }
        }
        return ans;
    }
}
