package greed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode56 {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->
            Integer.compare(a[0],b[0])
        );
        result.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= result.get(result.size() - 1)[1]){
                int start = result.get(result.size() - 1)[0];
                int end = Math.max(intervals[i][1],result.get(result.size() - 1)[1]);
                result.remove(result.size()-1);
                result.add(new int[]{start,end});
            }else {
                result.add(intervals[i]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
