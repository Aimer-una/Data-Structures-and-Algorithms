package hot100;

public class 搜索二维矩阵II {
    public boolean searchMatrix(int[][] matrix, int target) {
        // 暴力枚举
        for (int[] rows : matrix) {
            for (int num : rows) {
                if (num == target){
                    return true;
                }
            }
        }
        return false;
    }

    // 二分查找
    public boolean searchMatrixSearch(int[][] matrix, int target) {
        for (int[] row : matrix) {
            int isValid = search(row, target);
            if (isValid >= 0){
                return true;
            }
        }
        return false;
    }

    public int search(int[] arr,int target){
        int high = arr.length - 1;
        int low = 0;
        while (low <= high){
            int mid = (low + high) / 2;
            int num = arr[mid];
            if (num > target){
                high = mid - 1;
            }else if (num < target){
                low = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
