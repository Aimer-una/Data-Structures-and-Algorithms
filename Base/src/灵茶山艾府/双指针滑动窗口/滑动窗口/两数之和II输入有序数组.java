package 灵茶山艾府.双指针滑动窗口.滑动窗口;


public class 两数之和II输入有序数组 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right){
            if (numbers[left] + numbers[right] > target){
                right--;
            }else if (numbers[left] + numbers[right] < target){
                left++;
            }else {
               return new int[]{left+1,right+1};
            }
        }
        return new int[]{-1,-1};
    }
}
