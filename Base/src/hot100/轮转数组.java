package hot100;

public class 轮转数组 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < nums.length; i++) {
            arr[(i + k) % n] = nums[i];
        }
        System.arraycopy(arr,0,nums,0,n);
    }
}
