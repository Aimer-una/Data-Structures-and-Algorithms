package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// 39. 组合总和
public class LeetCode39 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTracking(candidates,target,0,0);
        return result;
    }
    public void backTracking(int[] candidates, int target , int sum , int startIndex){
        if (sum == target){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            sum += candidates[i];
            if (sum > target) break;
            path.add(candidates[i]);
            backTracking(candidates,target,sum,i);
            // 回溯
            sum-=candidates[i];
            path.remove(path.size()-1);
        }
    }
}
