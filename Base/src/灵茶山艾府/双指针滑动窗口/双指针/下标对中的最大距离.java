package 灵茶山艾府.双指针滑动窗口.双指针;
public class 下标对中的最大距离 {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int ans = 0;
        while (i < nums1.length && j< nums2.length){
            if (nums1[i] <= nums2[j]){
                if (i <= j){
                    ans = Math.max(ans,j-i);
                }
                j++;
            }else {
                i++;
            }
        }
        return ans;
    }
}
