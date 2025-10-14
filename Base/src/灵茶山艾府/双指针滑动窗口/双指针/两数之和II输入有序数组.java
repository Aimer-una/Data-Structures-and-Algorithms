package 灵茶山艾府.双指针滑动窗口.双指针;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 两数之和II输入有序数组 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 4}, 6)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right){
            if (numbers[left] + numbers[right] > target){
                right--;
            }else if (numbers[left] + numbers[right] < target){
                left++;
            }else {
                break;
            }
        }
        return new int[]{left+1,right + 1};
    }
}
