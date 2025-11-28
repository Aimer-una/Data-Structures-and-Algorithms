package 灵茶山艾府.数据结构.前缀和;

public class 统计范围内的元音字符串数 {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] arr = new int[words.length];
        int[] ans = new int[queries.length];
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            int n = chars.length;
            if (isVowel(chars[0]) && isVowel(chars[n-1])){
                arr[i] = 1;
            }
        }

        // 计算前缀和
        int[] s = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            s[i+1] = arr[i] + s[i];
        }

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            ans[i] = s[right + 1] - s[left];
        }
        return ans;
    }

    // 节省空间
    public int[] vowelStrings1(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];
        int[] a = new int[words.length + 1];
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);
            a[i+1] = a[i] + (isVowel(first) && isVowel(last) ? 1 : 0);
        }

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            ans[i] = a[right+1] - a[left];
        }
        return ans;
    }

    private boolean isVowel(char c){
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
}
