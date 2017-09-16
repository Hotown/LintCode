package Tree.BinaryTree;

import Utils.TreeNode;

public class InsertNode {
    /*
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if (root == null) {
            return node;
        }
        if (node.val > root.val) {
            root.right = insertNode(root.right, node);
        } else {
            root.left = insertNode(root.left, node);
        }

        return root;
    }
}
