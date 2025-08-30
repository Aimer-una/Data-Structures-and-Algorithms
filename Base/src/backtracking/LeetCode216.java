package backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
// 216. 组合总和 III
public class LeetCode216 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(k,n,1,0);
        return result;
    }

    public void backtracking(int k, int n, int startIndex, int sum){
        if (sum > n){
            return;
        }
        if (path.size() == k){
            if (n == sum){
                result.add(new ArrayList<>(path));
                return;
            }
        }
        for (int i = startIndex; i <= 9-(k-path.size()) + 1 ; i++) {
            path.add(i);
            sum+=i;
            backtracking(k,n,startIndex+1,sum);
            sum-=i;
            path.removeLast();
        }
    }
}
