package hot100;

public class 轮转数组 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < nums.length; i++) {
            /**
             * 问题：为什么 (i + k) % n 能精确算出新位置？
             * 核心思想：
             * 向右轮转 k 次 = 每个元素向右移动 k 位，超出末尾的“绕回”开头
             * 📐 数学原理：
             * 原位置：i（比如 i=3）
             * 向右移 k 位 → 新位置应该是 i + k
             * 但如果 i + k >= n（超出数组），就要 取模 n 实现“循环”
             * ✅ (i + k) % n 就是 带环绕的右移 k 位
             */
            arr[(i + k) % n] = nums[i];
        }
        // 但题目要求 修改原数组 nums（不能只返回新数组）
        // 把临时数组 arr 的内容，完整复制回原数组 nums
        System.arraycopy(arr,0,nums,0,n);
    }
}
