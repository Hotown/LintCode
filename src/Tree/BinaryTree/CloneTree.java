package Tree.BinaryTree;

import Utils.TreeNode;

/**
 * Created by Hotown on 17/4/15.
 */
public class CloneTree {
    /**
     * @param root: The root of binary tree
     * @return root of new tree
     */
    public TreeNode cloneTree(TreeNode root) {
        if(root == null)
            return null;
        TreeNode cloneNode = new TreeNode(root.val);
        cloneNode.left = cloneTree(root.left);
        cloneNode.right = cloneTree(root.right);
        return cloneNode;
    }
}
