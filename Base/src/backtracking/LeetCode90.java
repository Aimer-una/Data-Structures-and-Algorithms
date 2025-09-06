package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// 90. 子集 II
public class LeetCode90 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    boolean[] array;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        array = new boolean[nums.length];
        Arrays.sort(nums);
        backtracking(nums,0,array);
        return result;
    }

    public void backtracking(int[] nums, int startIndex, boolean[] array){
        result.add(new ArrayList<>(path));
        if (startIndex >= nums.length){
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            if (nums[i] == nums[i-1] && !array[i-1]){
                continue;
            }
            path.add(nums[i]);
            array[i] = true;
            backtracking(nums,i+1,array);
            path.remove(path.size()-1);
            array[i] = false;
        }
    }
}
