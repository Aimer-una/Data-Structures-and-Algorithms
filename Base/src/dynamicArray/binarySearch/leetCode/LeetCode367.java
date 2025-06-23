package dynamicArray.binarySearch.leetCode;

public class LeetCode367 {
    public static void main(String[] args) {
        boolean perfectSquare = isPerfectSquare(25);
        System.out.println(perfectSquare);
    }

    public static boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;

        while (left<=right){
            // 计算中点 mid，使用 (right - left)/2 而不是 (left + right)/2 是为了防止溢出
          int mid = left + (right - left) / 2;
            if (num < mid*mid){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return (right * right == num);
    }
}
