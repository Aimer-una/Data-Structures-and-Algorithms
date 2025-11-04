package 灵茶山艾府.双指针滑动窗口.双指针;

public class 数组中的最长山脉 {
    public int longestMountain(int[] arr) {
        int i = 0;
        int ans = 0;
        int n = arr.length;
        while (i < n - 2){
            while (i < n - 1 && arr[i] >= arr[i+1]){
                i++;
            }
            // 山底
            int start = i;
            while (i < n - 1 && arr[i] < arr[i+1]){
                i++;
            }
            // 如果没上坡（start == i），说明刚才只是平地或单点，跳过
            if (start == i){
                continue;
            }
            // 山顶
            int peek = i;
            while (i < n - 1 && arr[i] > arr[i+1]){
                i++;
            }
            // 6️⃣ 如果有下坡（i > peak），说明构成了完整山脉
            if (i > peek){
                ans = Math.max(ans,i-start+1);
            }
        }
        return ans;
    }
}
