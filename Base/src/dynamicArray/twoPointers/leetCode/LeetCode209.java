package dynamicArray.twoPointers.leetCode;

public class LeetCode209 {
    public static void main(String[] args) {
        int[]nums = {2,3,4,5};
        System.out.println(getMinArray(nums, 6));
    }

    public static Integer getMinArray(int[]nums,int s){
        int i = 0;
        int result = Integer.MAX_VALUE;
        int sum = 0;

        for (int j = 0; j <nums.length ; j++) {
            sum += nums[j];
            while (sum>=s){
                result = Math.min(result,j-i+1);
                sum-=nums[i];
                i++;
            }
        }
       return result;
    }
}
