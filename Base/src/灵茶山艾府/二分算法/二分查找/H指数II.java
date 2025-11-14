package 灵茶山艾府.二分算法.二分查找;

public class H指数II {
    public int hIndex(int[] citations) {
        int left = 0;
        int n = citations.length;
        int right = n - 1;
        int ans = 0;
        while (left <= right){
            int mid = left + right >>> 1;
            int h = n - mid; // 如果从 mid 开始，有 h 篇论文
            if (citations[mid] >= h){
                // 记录当前可行的 h
                ans = h;
                // 可行！尝试找更小的 mid（更大的 h）
                right = mid - 1;
            }else {
                // citations[mid] < h → 引用太低，需要往右走（减少论文数，增大每篇引用要求）
                left = mid + 1;
            }
        }
        return ans;
    }
}
