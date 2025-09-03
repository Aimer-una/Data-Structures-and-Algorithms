package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// 40. 组合总和 II
public class LeetCode40 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    boolean [] array;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        array = new boolean[candidates.length];
        backTracking(candidates,target,0,array,0);
        return result;
    }
    public void backTracking(int[] candidates, int target, int sum , boolean[]array , int startIndex){
        if (sum > target){
            return;
        }
        if (sum == target){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            if (i > 0 && candidates[i] == candidates[i-1] && !array[i-1]){
                continue;
            }
            path.add(candidates[i]);
            array[i] = true;
            sum += candidates[i];
            backTracking(candidates, target, sum, array, i+1);
            path.remove(path.size() - 1);
            sum -= candidates[i];
            array[i] = false;
        }
    }
}
