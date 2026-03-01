package hot100;

public class 接雨水 {
    public int trap(int[] height) {
        int n = height.length;
        // 前缀数组
        int[] pre = new int[n];
        int preMax = 0;
        // 后缀数组
        int[] buf = new int[n];
        int bufMax = 0;
        for (int i = 0; i < n; i++) {
            if (height[i] > preMax){
                preMax = height[i];
            }
            pre[i] = preMax;
        }
        for (int i = n - 1; i > 0 ; i--) {
            if (height[i] > bufMax){
                bufMax = height[i];
            }
            buf[i] = bufMax;
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(pre[i],buf[i]) - height[i];
        }
        return ans;
    }
}
