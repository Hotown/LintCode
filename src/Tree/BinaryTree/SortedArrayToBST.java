package Tree.BinaryTree;

import Utils.TreeNode;

/**
 * Created by Hotown on 17/4/22.
 */
public class SortedArrayToBST {
    /**
     * 给一个排序数组（从小到大），将其转换为一棵高度最小的排序二叉树。
     *
     * @param A
     * @return
     */
    public TreeNode sortedArrayToBST(int[] A) {
        if (A == null) {
            return null;
        }
        return buildTree(A, 0, A.length - 1);
    }

    public TreeNode buildTree(int[] num, int start, int end) {
        if (start > end) {
            return null;
        }
        TreeNode node = new TreeNode(num[(start + end) / 2]);
        node.left = buildTree(num, start, (start + end) / 2 - 1);
        node.right = buildTree(num, (start + end) / 2 + 1, end);
        return node;
    }
}
