package 灵茶山艾府.二分算法.二分查找;

public class 寻找比目标字母大的最小字母 {
    public char nextGreatestLetter(char[] letters, char target) {
        int ans = lowerBound(letters, (char) (target+1));
        if (ans == letters.length){
            return letters[0];
        }
        return letters[ans];
    }

    private int lowerBound(char[] letters, char target){
        int left = 0;
        int right = letters.length - 1;
        while (left <= right){
            int mid = left + right >>> 1;
            if (letters[mid] >= target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
}
