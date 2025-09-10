package backtracking;

import java.util.ArrayList;
import java.util.List;
// 46. 全排列
public class LeetCode46 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    boolean[]used;
    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        backtracking(nums,used);
        return result;
    }

    public void backtracking(int[] nums, boolean[] used){
        if (path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]){
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            backtracking(nums,used);
            path.remove(path.size()-1);
            used[i] = false;
        }
    }
}
