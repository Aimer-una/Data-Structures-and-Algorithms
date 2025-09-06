package backtracking;

import java.util.ArrayList;
import java.util.List;
// 78. 子集
public class LeetCode78 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtracking(nums,0);
        return result;
    }

    public void backtracking(int[] nums, int startIndex){
        result.add(new ArrayList<>(path));
        if (startIndex >= nums.length){
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]);
            backtracking(nums,i+1);
            // 回溯
            path.remove(path.size() - 1);
        }
    }
}
