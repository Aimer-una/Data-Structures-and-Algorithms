package sorting;

import java.util.Arrays;

public class BubbleSort {
    // 冒泡排序
    public static void bubbleSort(int[]nums){
        if (nums == null || nums.length <= 1){
            return;
        }
        int length = nums.length;
        for (int i = 0; i < length-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < length-1-i; j++) {
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[]nums = {5,4,3,2,1};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
