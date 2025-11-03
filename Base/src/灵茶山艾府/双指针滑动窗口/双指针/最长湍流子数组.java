package 灵茶山艾府.双指针滑动窗口.双指针;

public class 最长湍流子数组 {
    public int maxTurbulenceSize(int[] arr) {
        int i = 0;
        int n = arr.length;
        int ans = 1;
        while (i < n - 1){
            // 如果是重复元素直接跳过查找下一段湍流
            if (arr[i] == arr[i+1]){
                i++;
                continue;
            }
            // 确定湍流的起始位置
            int start = i;
            i++;
            while (i < n-1 && (long) (arr[i] - arr[i-1]) * (arr[i+1] - arr[i]) < 0){
                i++;
            }
            ans = Math.max(ans,i-start+1);
        }
        return ans;
    }
}
