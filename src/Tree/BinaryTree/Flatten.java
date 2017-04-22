package Tree.BinaryTree;

import Utils.TreeNode;

/**
 * Created by Hotown on 17/4/22.
 */
public class Flatten {
    /**
     * 将一棵二叉树按照前序遍历拆解成为一个假链表。所谓的假链表是说，用二叉树的 right 指针，来表示链表中的 next 指针。
     * @param root
     */

    /**
     * 递归实现
     *
     * @param root
     */
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            flatten(root.left);
        }
        if (root.right != null) {
            flatten(root.right);
        }
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = null;
        while (root.right != null) {
            root = root.right;
        }
        root.right = tmp;
    }

    /**
     * 非递归实现
     */
    public void notReFlatten(TreeNode root) {
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left != null) {
                TreeNode tmp = cur.left;
                while (tmp.right != null) {
                    tmp = tmp.right;
                }
                tmp.right = cur.right;
                cur.right = cur.left;
                cur.left = null;
            }
            cur = cur.right;
        }
    }
}
