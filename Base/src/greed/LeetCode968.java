package greed;

import binarytree.TreeNode;
// 968. 监控二叉树
public class LeetCode968 {
    int res = 0;
    public int minCameraCover(TreeNode root) {
        // 对根节点的状态做检验,防止根节点是无覆盖状态 .
        if (minCame(root) == 0){
            res++;
        }
        return res;
        /**
         节点的状态值：
         0 表示无覆盖
         1 表示 有摄像头
         2 表示有覆盖
         后序遍历，根据左右节点的情况,来判读 自己的状态
         */
    }

    // 后序遍历
    public int minCame(TreeNode root){
        if (root == null){
            return 2;
        }
        // 左
        int left = minCame(root.left);
        // 右
        int right = minCame(root.right);
        // 中
        // 左右节点都有覆盖,父节点无覆盖
        if (left == 2 && right == 2){
            return 0;
        }
        // 左右节点都没有有覆盖，父节点有摄像头
        if (left == 0 || right == 0){
            res++;
            return 1;
        }else {
            // 左右孩子至少有一个有摄像头，父节点已覆盖
            return 2;
        }
    }
}
