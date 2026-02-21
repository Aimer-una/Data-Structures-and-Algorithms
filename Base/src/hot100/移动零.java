package hot100;

public class 移动零 {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0,right = 0;
        // left指向的是非0元素所占用的位置
        while (right < n){
            if (nums[right] != 0){
                swap(nums,left,right);
                left++;
            }
            right++;
        }
    }

    private void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
