package 灵茶山艾府.双指针滑动窗口;

public class 大小为K且平均值大于等于阈值的子数组数目 {

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        double avg = 0;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];

            // 获取当前窗口的位置
            int left = i-k+1;
            if (left < 0){
                // 如果窗口大小没有满足k，那么直接跳过进入下一层循环
                continue;
            }
            double currentAvg  = avg/k;
            if (currentAvg  >= threshold){
                result++;
            }
            // 3. 左端点离开窗口，为下一个循环做准备
            avg -= arr[left];
        }
        return result;
    }
}
