package binarySearch;

public class BinarySearchBase {
    public static void main(String[] args) {
        int [] a = {1,5,5,7,7,8,10,27};
        int result = binarySearchValueLeftmost(a, 6);
        System.out.println(result);

    }

    /**
     * 二分查找基础版
     * @param a 带查找的升序数组
     * @param target 待查找的目标值
     * @return 目标数据找不到返回-1，找到了返回目标数据的索引值
     */
    public static int binarySearch(int[]a , int target){
        // 设置指针和初始值（i和j都有可能是我们的查找目标）
        int i = 0;
        int j = a.length - 1;
        while (i <= j){
            int m = (i+j) >>> 1;
            if (target < a[m]){ // 目标值在左边
                // 目标值小于中间值
                j = m-1;
            }else if (a[m] < target){ // 目标值在右边
                // 目标值大于中间值
                i = m+1;
            }else {
                return m;
            }
        }
        return -1;
    }

    /*
        问题一:为什么i<=j 意味着区间有未比较的元素 而不是i<j
            因为:i和j它们指向的元素也会参与比较
     */

    // 二分查找改动版
    public static int binarySearchAlert(int[]a , int target) {
        // 定义初始值和指针
        int i = 0;
        int j = a.length;  // j指向的一定不是我们的查找目标(重点) , j只作为一个边界
        while (i < j) {  //这里如果加“=”号可能会陷入死循环 , 如果待查找值不是在数组里面的使用“=”号就会死循环
            // 获取中间值
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m; // 如果这里用m+1的话 有可能会错过目标值
            } else if (a[m] < target) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    /* 总结：基础版和改动版最重要的区别
        基础版：i和j都有可能是我们的查找目标
        改动版：j指向的一定不是我们的查找目标(重点) , j只作为一个边界
     */

    // 二分查找Leftmost(如果存在相同目标元素，选择最左边的那个)
    public static int binarySearchLeftmost(int[]a , int target){
        // 设置指针和初始值（i和j都有可能是我们的查找目标）
        int candidate = -1;
        int i = 0;
        int j = a.length - 1;
        while (i <= j){
            int m = (i+j) >>> 1;
            if (target < a[m]){ // 目标值在左边
                // 目标值小于中间值
                j = m-1;
            }else if (a[m] < target){ // 目标值在右边
                // 目标值大于中间值
                i = m+1;
            }else {
                candidate = m;
                j = m-1;
            }
        }
        return candidate;
    }

    // 二分查找Rightmost(如果存在相同目标元素，选择最左边的那个)
    public static int binarySearchRightmost(int[]a , int target){
        // 设置指针和初始值（i和j都有可能是我们的查找目标）
        int candidate = -1;
        int i = 0;
        int j = a.length - 1;
        while (i <= j){
            int m = (i+j) >>> 1;
            if (target < a[m]){ // 目标值在左边
                // 目标值小于中间值
                j = m-1;
            }else if (a[m] < target){ // 目标值在右边
                // 目标值大于中间值
                i = m+1;
            }else {
                candidate = m;
                i = m+1;
            }
        }
        return candidate;
    }

    // 二分查找Leftmost(如果搜索不存在的数据，则返回比该数据大的最左边的那一个索引)
    public static int binarySearchValueLeftmost(int[]a , int target){
        // 设置指针和初始值（i和j都有可能是我们的查找目标）
        int i = 0;
        int j = a.length - 1;
        while (i <= j){
            int m = (i+j) >>> 1;
            if (target <= a[m]){ // 目标值在左边
                // 目标值小于中间值
                j = m-1;
            }else{ // 目标值在右边
                // 目标值大于中间值
                i = m+1;
            }
        }
        return i;
    }

    // 二分查找Rightmost(返回<=target的最靠右索引)
    public static int binarySearchValueRightmost(int[]a , int target){
        // 设置指针和初始值（i和j都有可能是我们的查找目标）
        int i = 0;
        int j = a.length - 1;
        while (i <= j){
            int m = (i+j) >>> 1;
            if (target < a[m]){ // 目标值在左边
                // 目标值小于中间值
                j = m-1;
            }else{ // 目标值在右边
                // 目标值大于中间值
                i = m+1;
            }
        }
        return i-1;
    }



}
