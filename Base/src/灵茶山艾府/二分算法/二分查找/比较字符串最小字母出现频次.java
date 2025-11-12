package 灵茶山艾府.二分算法.二分查找;

import java.util.Arrays;

public class 比较字符串最小字母出现频次 {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        // Step 1: 预处理 words，计算每个 f(w)
        int[] wordFreqs = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            wordFreqs[i] = f(words[i]);
        }

        // Step 2: 排序 wordFreqs（升序）
        Arrays.sort(wordFreqs);

        // Step 3: 处理每个 query
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int target = f(queries[i]);
            // 找第一个 > fq 的位置（upperBound）
            int pos = lowerBound(wordFreqs, target + 1);
            ans[i] = wordFreqs.length - pos;
        }
        return ans;
    }

    private int lowerBound(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int mid = left + right >>> 1;
            if (arr[mid] >= target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int f(String s){
        int[] ctn = new int[26];
        for (char c : s.toCharArray()) {
            ctn[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (ctn[i] > 0){
                return ctn[i]; // 第一个返回的就是最小的那个字母的频次
            }
        }
        return 0; // 这一行不会触发
    }
}
