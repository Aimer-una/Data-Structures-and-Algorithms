package sorting;

import java.util.Arrays;
// 快速排序
public class QuickSort {
    public static void quickSort(int[]nums,int low,int high){
        if (low < high){
            int partition = partition(nums, low, high);
            // 左边
            quickSort(nums,low,partition-1);
            // 右边
            quickSort(nums,partition+1,high);
        }
    }
    public static int partition(int[]nums,int low,int high){
        int mid = nums[low];
        while (low < high){
            while (low < high && nums[high] >= mid){
                high--;
            }
            nums[low] = nums[high];
            while (low < high && nums[low] <= mid){
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = mid;
        return low;
    }

    public static void main(String[] args) {
        int[]nums = {5,4,3,2,1};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
